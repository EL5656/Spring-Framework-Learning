package org.example.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);//step 4
        BrandX model = factory.getBean(BrandX.class);//step 1 get class
        model.config();
    }
}
