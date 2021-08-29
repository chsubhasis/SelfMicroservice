package com.optimagrowth.orgsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class OrgSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgSvcApplication.class, args);
	}

}
