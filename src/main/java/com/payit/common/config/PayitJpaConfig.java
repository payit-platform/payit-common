package com.payit.common.config;

import jakarta.persistence.EntityManager;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@AutoConfiguration(after = HibernateJpaAutoConfiguration.class)
@ConditionalOnClass(EntityManager.class)
@EnableJpaAuditing
public class PayitJpaConfig {
}
