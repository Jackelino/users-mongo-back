package com.appranch.appranch.services;

import com.appranch.appranch.dao.UserInterface;
import com.appranch.appranch.documents.UserDocument;
import com.appranch.appranch.models.User;
import com.appranch.appranch.repositories.UserRepository;
import com.appranch.appranch.requests.UserRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.LinkedList;
import java.util.List;

@Service
@Validated
public class UserService implements UserInterface {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<User> findAll() {
        List<UserDocument> users = this.userRepository.findAll();
        List<User> userList = new LinkedList<>();
        for (UserDocument User : users) {
            userList.add(modelMapper.map(User, User.class));
        }
        return userList;
    }

    @Override
    public User save(UserRequest userRequest) {
        UserDocument userDocument = this.userRepository.save(modelMapper.map(userRequest, UserDocument.class));
        return modelMapper.map(userDocument, User.class);
    }

    @Override
    public User update(UserRequest userRequest, long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
