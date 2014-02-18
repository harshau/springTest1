package com.spring.config;

import com.spring.beans.PrintData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by harsh on 2/13/14.
 */

@Configuration
public class ApplicationConfiguration {

    @Bean
    public PrintData helloWorld(){
        return new PrintData();
    }
}
