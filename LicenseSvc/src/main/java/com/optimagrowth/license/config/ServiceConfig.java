package com.optimagrowth.license.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration

//pulls all the example properties from the Spring Cloud Configuration Server and
//injects these into the property attribute on the ServiceConfig class.
@ConfigurationProperties(prefix = "example")

@Getter
@Setter
public class ServiceConfig {

	private String property;

}