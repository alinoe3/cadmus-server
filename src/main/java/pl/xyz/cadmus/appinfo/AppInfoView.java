package pl.xyz.cadmus.appinfo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class AppInfoView {

    private String title;
    private String about;
}

