package com.learn.tso;

import com.learn.tso.ioc.HelloWorld;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
    private ApplicationContext context;

    public static void main( String[] args ) {
        ConfigurableApplicationContext configurableContext = SpringApplication.run(App.class, args);
        HelloWorld helloWorld = (HelloWorld)configurableContext.getBean("helloWorld");
        helloWorld.say();
    }
}
