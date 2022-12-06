package com.commute.friendfamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FriendFamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendFamilyApplication.class, args);
	}

}
