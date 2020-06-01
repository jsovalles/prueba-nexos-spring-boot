package com.nexos.springboot.web.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.nexos.springboot.web.app.AuditorAwareImpl;

@Configuration
@EnableJpaAuditing
public class MainConfiguration {
    
        @Bean
        public AuditorAware<String> auditorProvider() {
            return new AuditorAwareImpl();
        }
        
}