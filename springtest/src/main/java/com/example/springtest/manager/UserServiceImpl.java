package com.example.springtest.manager;

import com.example.springtest.entity.User;
import com.example.springtest.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserServiceImpl implements UserService {
    private static List<User>userList=new ArrayList<>();
    static {
        userList.add(new User(1,"Benovse Aydinli",22));
        userList.add(new User(2,"Fexri Hesenzade",25));
        userList.add(new User(3,"Rufet Huseynov",26));
        userList.add(new User(4,"Gunel Aydinli",27));
        userList.add(new User(5,"Aysel Balammedova",28));
        userList.add(new User(6,"Benovse Aydinli",29));
        userList.add(new User(7,"Elvin Aliyev",30));

    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public void delete(int id) {
     userList.remove(id-1);
    }

    @Override
    public void create(User user) {
      userList.add(user);
    }

    @Override
    public User getById(int id) {
        return userList.get(id);
    }

}
