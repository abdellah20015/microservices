package com.bmar1.myapp.users.services;

import com.bmar1.myapp.users.dto.UserDto;
import com.bmar1.myapp.users.model.UserInfo;
import com.bmar1.myapp.users.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UsersService {

    @Inject
    private UserRepository userRepository;

    public UserInfo saveNewUser(UserDto userDto)  {

        UserInfo user = new UserInfo();
        user.setUsername(userDto.getUsername());
        user.setPasswordhash((new BCryptPasswordEncoder()).encode(userDto.getPassword()));
        user.setRole("USER");
        return userRepository.save(user);
    }
}
