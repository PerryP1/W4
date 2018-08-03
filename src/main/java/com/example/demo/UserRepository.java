package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByAcct(int acct);

    Long countByUsername(String username);
    Long countByAcct(int acct);

}