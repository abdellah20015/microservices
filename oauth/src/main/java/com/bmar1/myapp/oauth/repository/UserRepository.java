package com.bmar1.myapp.oauth.repository;

import com.bmar1.myapp.oauth.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, Long> {
    UserInfo findByUsername(String username);

}
