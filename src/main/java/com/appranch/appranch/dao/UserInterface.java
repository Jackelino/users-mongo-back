package com.appranch.appranch.dao;

import com.appranch.appranch.models.User;
import com.appranch.appranch.requests.UserRequest;
import jakarta.validation.Valid;

import java.util.List;

public interface UserInterface {
    List<User> findAll();

    User save(@Valid UserRequest userRequest);

    User update(@Valid UserRequest userRequest, long id);

    boolean delete(Long id);
}
