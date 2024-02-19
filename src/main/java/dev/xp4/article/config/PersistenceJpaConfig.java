package dev.xp4.article.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = {"dev.xp4.article.persistence.entity"})
@EnableJpaRepositories(basePackages = {"dev.xp4.article.persistence.repository"})
public class PersistenceJpaConfig {
}
