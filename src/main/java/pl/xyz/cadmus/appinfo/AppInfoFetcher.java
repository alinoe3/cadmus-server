package pl.xyz.cadmus.appinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.xyz.cadmus.appinfo.repo.AppInfo;
import pl.xyz.cadmus.appinfo.repo.AppInfoRepository;

@Service
@Transactional(readOnly = true)
public class AppInfoFetcher {

    private static final Logger log = LoggerFactory.getLogger(AppInfoFetcher.class);

    private final AppInfoRepository appInfoRepository;

    @Autowired
    public AppInfoFetcher(AppInfoRepository appInfoRepository) {
        this.appInfoRepository = appInfoRepository;
    }

    public AppInfoView fetch() {
        log.info("Fetching application data.");

        AppInfo appInfo = appInfoRepository.find().orElseThrow(() -> new RuntimeException("App info not found"));

        return AppInfoView.builder()
                .title(appInfo.getTitle())
                .about(appInfo.getAbout())
                .build();
    }
}
