package com.chakray.usersapi.service;

import com.chakray.usersapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public UserService() {

        users.add(new User(1L,"john@email.com","John Doe","111111","1234","TAX1"));
        users.add(new User(2L,"ana@email.com","Ana Smith","222222","1234","TAX2"));
        users.add(new User(3L,"mike@email.com","Mike Brown","333333","1234","TAX3"));

    }

    public List<User> getUsers(String sortedBy) {
        return users;
    }

    public User getUserById(Long id) {

        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User createUser(User user) {

        user.setId((long) (users.size() + 1));
        users.add(user);
        return user;
    }

    public User updateUser(Long id, User updatedUser) {

        for (User user : users) {

            if (user.getId().equals(id)) {

                user.setEmail(updatedUser.getEmail());
                user.setName(updatedUser.getName());
                user.setPhone(updatedUser.getPhone());
                user.setPassword(updatedUser.getPassword());
                user.setTaxId(updatedUser.getTaxId());

                return user;
            }
        }

        return null;
    }

    public String deleteUser(Long id) {

        users.removeIf(user -> user.getId().equals(id));

        return "User deleted successfully";
    }

}