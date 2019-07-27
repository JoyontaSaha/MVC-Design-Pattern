package com.codegym.task.task36.task3608.model;

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.model.service.UserService;
import com.codegym.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

/*
replace our fake Model
with a real one that receives data from the DataSource
 */


public class MainModel implements Model{
    private DataModel dataModel = new DataModel();
    private UserService userService = new UserServiceImpl();

    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
        dataModel.setDisplayDeletedUserList(false);
        dataModel.setUsers(getAllUsers());

    }

    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        dataModel.setUsers(users);
        dataModel.setDisplayDeletedUserList(true);
    }

    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        dataModel.setActiveUser(user);

    }

    @Override
    public void deleteUserById(long id) {
        userService.deleteUser(id);
        loadUsers();

    }

    private List<User> getAllUsers() {
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));
    }

    public void changeUserData(String name, long id, int level) {
        userService.createOrUpdateUser(name, id, level);
        loadUsers();
    }



}