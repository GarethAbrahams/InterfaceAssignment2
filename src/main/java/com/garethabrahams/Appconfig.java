package com.garethabrahams;

import org.springframework.context.annotation.Bean;

public class Appconfig {

    @Bean(name="dvd")
    public DVDInterface getService(){
        return new DVDServiceImpl();
    }
}
