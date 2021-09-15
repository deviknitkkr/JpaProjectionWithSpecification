package com.vikas;

import com.vikas.entity.Address;
import com.vikas.repository.AddressRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import th.co.geniustree.springdata.jpa.repository.support.JpaSpecificationExecutorWithProjectionImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = JpaSpecificationExecutorWithProjectionImpl.class)
public class ProjspecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjspecApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runOnStart(AddressRepository repo){
		return args->{
			repo.save(new Address(321201,"raj","manota"));
			repo.save(new Address(321205,"up","bhadeera"));
			repo.save(new Address(321203,"raj","ranota"));
			repo.save(new Address(321287,"up","manota"));
			repo.save(new Address(1234,"raj","nagar"));
			};
	}
}
