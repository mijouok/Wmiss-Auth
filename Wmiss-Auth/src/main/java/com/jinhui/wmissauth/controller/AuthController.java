package com.jinhui.wmissauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinhui.wmissauth.dto.R;
import com.jinhui.wmissauth.dto.UserDto;
import com.jinhui.wmissauth.entity.User;
import com.jinhui.wmissauth.service.AuthService;

/**
 * DESCRIPTION_OF_YOUR_CLASS
 *
 * @author lupeng (elupeng@163.com)
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signin")
    public R<?> authenticateUser(@RequestBody UserDto loginRequest) {
        String jwt = authService.authenticateUser(
                loginRequest.getUsername(),
                loginRequest.getPassword());

        return R.ok(jwt);
    }

    @PostMapping("/signup")
    public R<?> registerUser(@RequestBody UserDto signUpRequest) {
        User user = authService.registerUser(
                signUpRequest.getUsername(),
                signUpRequest.getEmail(),
                signUpRequest.getPassword());

        return R.ok("User registered successfully!");
    }
}
