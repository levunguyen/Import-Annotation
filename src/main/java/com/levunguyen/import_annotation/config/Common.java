package com.levunguyen.import_annotation.config;

import com.levunguyen.import_annotation.models.Share;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Common {

    @Bean(name = "share")
    public Share share() {
        return new Share();
    }
}
