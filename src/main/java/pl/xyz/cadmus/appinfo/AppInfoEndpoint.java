package pl.xyz.cadmus.appinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app-info")
public class AppInfoEndpoint {

    private final AppInfoFetcher appInfoFetcher;

    @Autowired
    public AppInfoEndpoint(AppInfoFetcher appInfoFetcher) {
        this.appInfoFetcher = appInfoFetcher;
    }

    @GetMapping
    public AppInfoView getAppInfo() {
        return appInfoFetcher.fetch();
    }
}
