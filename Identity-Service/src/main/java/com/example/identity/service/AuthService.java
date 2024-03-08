package com.example.identity.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.identity.dto.UserCredentialDto;
import com.example.identity.model.UserCredential;
import com.example.identity.repository.UserCredentialRepository;

@Service
public class AuthService {

	@Autowired
	private UserCredentialRepository repository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private ModelMapper modelMapper;
	boolean flag;
	
	 
	public String save(UserCredentialDto userCredentialDto) {
        List<UserCredential> userList = repository.findAll();
        List<UserCredentialDto> userDtoList = userList.stream()
                                        .map(user -> modelMapper.map(user, UserCredentialDto.class))
                                        .collect(Collectors.toList());

        boolean flag = false;
        if (userDtoList != null) {
            for (UserCredentialDto user : userDtoList) {
                if (user.getName().equals(userCredentialDto.getName())) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                return "User already exists";
            } else {
                userCredentialDto.setPassword(passwordEncoder.encode(userCredentialDto.getPassword()));
                UserCredential userCredential = modelMapper.map(userCredentialDto, UserCredential.class);
                repository.save(userCredential);
                return "Saved User";
            }
        }
        return "Unable to process registration";
    }
	public String generateToken(String username) {
		return jwtService.generateToken(username);
	}

	public void validateToken(String token) {
		jwtService.validateToken(token);
	}

	

}