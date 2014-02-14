package com.spring.config;

import com.spring.beans.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by harsh on 2/13/14.
 */

@Configuration
public class ApplicationConfiguration {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
