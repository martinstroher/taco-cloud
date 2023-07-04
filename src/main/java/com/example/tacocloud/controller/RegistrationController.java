package com.example.tacocloud.controller;

import com.example.tacocloud.entity.RegistrationForm;
import com.example.tacocloud.entity.User;
import com.example.tacocloud.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/register")
@Controller
@Slf4j
@AllArgsConstructor
public class RegistrationController {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String registerForm() {
        return "registrationForm";
    }

    @PostMapping
    public String proccesRegistration(RegistrationForm form) {
        userRepository.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
