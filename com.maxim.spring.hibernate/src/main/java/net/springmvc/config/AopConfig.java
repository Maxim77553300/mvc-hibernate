package net.springmvc.config;


import net.springmvc.aspect.MyLoggingAspect;
import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {

    @Bean
    public MyLoggingAspect myLoggingAspect(){
        return new MyLoggingAspect();
    }


}
