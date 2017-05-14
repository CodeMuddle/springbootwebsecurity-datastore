package com.spring.webSecurity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
	public Account findByUsername(String userName);

}
