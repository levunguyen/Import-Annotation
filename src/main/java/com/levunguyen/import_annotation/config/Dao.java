package com.levunguyen.import_annotation.config;

import com.levunguyen.import_annotation.models.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Dao {

    @Bean(name = "connect")
    public Connection connect() {
        return new Connection();
    }
}
