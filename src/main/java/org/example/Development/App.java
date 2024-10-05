package org.example.Development;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        Dev obj = (Dev) context.getBean("dev");
        obj.build();
        System.out.println(obj.getAge());
    }
}
