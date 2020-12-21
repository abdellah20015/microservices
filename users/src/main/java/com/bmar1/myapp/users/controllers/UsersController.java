package com.bmar1.myapp.users.controllers;

import com.bmar1.myapp.users.dto.UserDto;
import com.bmar1.myapp.users.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.text.ParseException;

@RestController
@RequestMapping("/")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @RequestMapping(value = "/users", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity saveUsers(@RequestBody UserDto userDto, Principal principal) throws ParseException {
        String currentPrincipalName = principal.getName();
        return new ResponseEntity<>(usersService.saveNewUser(userDto), HttpStatus.OK);
    }

}
