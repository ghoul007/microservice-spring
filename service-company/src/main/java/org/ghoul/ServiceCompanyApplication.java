package org.ghoul;

import java.util.stream.Stream;

import org.ghoul.dao.CompanyRepository;
import org.ghoul.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableDiscoveryClient
public class ServiceCompanyApplication  {
	@Autowired
	private CompanyRepository companyRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceCompanyApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args -> {
			Stream.of("A", "B", "C").forEach(cn -> companyRepository.save(new Company( cn, 100 + Math.random() * 900)));
			companyRepository.findAll().forEach(System.out::println);
		};
	}

 
}
