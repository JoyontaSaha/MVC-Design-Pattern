package com.codegym.task.task36.task3608.model;

/*
We should be able to use any model to get all of the data we need to display.
 */

public interface Model {
    DataModel getDataModel();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long userId);
    void deleteUserById(long id);
    void changeUserData(String name, long id, int level);

}
