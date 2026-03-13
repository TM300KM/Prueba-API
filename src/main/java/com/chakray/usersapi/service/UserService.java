package com.chakray.usersapi.service;

import com.chakray.usersapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public UserService() {

        users.add(new User(1L,"john@mail.com","John Doe","+52 722 222 333","1234","RFC1"));
        users.add(new User(2L,"ana@mail.com","Ana Smith","+52 722 222 444","1234","RFC2"));
        users.add(new User(3L,"mike@mail.com","Mike Brown","+52 722 222 555","1234","RFC3"));

    }

    public List<User> getUsers(String sortedBy) {

        if(sortedBy == null) return users;

        return users.stream()
                .sorted(getComparator(sortedBy))
                .toList();
    }

    private Comparator<User> getComparator(String field){

        return switch(field){
            case "email" -> Comparator.comparing(User::getEmail);
            case "name" -> Comparator.comparing(User::getName);
            case "phone" -> Comparator.comparing(User::getPhone);
            case "taxId" -> Comparator.comparing(User::getTaxId);
            default -> Comparator.comparing(User::getId);
        };

    }

}