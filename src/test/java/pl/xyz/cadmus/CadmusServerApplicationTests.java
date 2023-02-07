package pl.xyz.cadmus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import pl.xyz.cadmus.appinfo.repo.AppInfo;
import pl.xyz.cadmus.appinfo.repo.AppInfoRepository;

import java.sql.Timestamp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@ActiveProfiles("test")
class CadmusServerApplicationTests {

    @Autowired
    private AppInfoRepository appInfoRepository;

    @Test
    @DisplayName("Skeleton for integration tests")
    void shouldFindAppInfo() {
        //When
        AppInfo appInfo = appInfoRepository.findById(1L).orElse(null);

        //Then
        assertThat(appInfo, is(notNullValue()));
        assertThat(appInfo.getTitle(), is(equalTo("Cadmus")));
    }
}
