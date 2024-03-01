package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.RegistrationDto;
import net.javaguides.springboot.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}
