package pl.xyz.cadmus.appinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AppInfoRepository extends JpaRepository<AppInfo, Long> {

    @Query("select a from AppInfo a where a.id = 1")
    Optional<AppInfo> find();
}
