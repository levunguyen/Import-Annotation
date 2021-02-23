package com.levunguyen.import_annotation.config;

import com.levunguyen.import_annotation.models.Page;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(value = {Common.class,Dao.class } )
public class Web {

    @Bean(name = "page")
    public Page page() {
        return new Page();
    }
}