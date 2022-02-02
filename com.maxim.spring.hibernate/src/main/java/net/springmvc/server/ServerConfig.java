package net.springmvc.server;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "net.springmvc.server"})
@PropertySource("classpath:server.properties")
public class ServerConfig {

}
