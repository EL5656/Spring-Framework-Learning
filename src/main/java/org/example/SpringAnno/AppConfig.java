package org.example.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //step 3
    @Bean
    public BrandX getDevice(){
        return new BrandX();//return a bean
    }
    @Bean
    public DeviceProcessor getProcessor(){//d
        return new BrandY();
    }
}
