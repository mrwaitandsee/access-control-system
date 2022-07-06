package com.herokuapp.kosterev.accesscontrolsystem;

import com.herokuapp.kosterev.accesscontrolsystem.entity.AccountEntity;
import com.herokuapp.kosterev.accesscontrolsystem.mapper.AccountEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class AccessControlSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AccessControlSystemApplication.class, args);
	}

	@Autowired
	private AccountEntityMapper accountEntityMapper;

	@Override
	public void run(String... args) throws Exception {
		accountEntityMapper.saveOne(
				new AccountEntity(
						UUID.randomUUID(),
						"mrwaitandsee",
						"mrwaitandsee",
						UUID.fromString("00000000-0000-0000-0000-000000000000")
				)
		);
		accountEntityMapper.findAll().forEach(accountEntity -> System.out.println(accountEntity.getName()));
	}
}
