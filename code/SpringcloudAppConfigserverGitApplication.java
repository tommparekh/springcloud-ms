package test.springdemo.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudAppConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudAppConfigserverGitApplication.class, args);
	}

}
