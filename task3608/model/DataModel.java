package com.codegym.task.task36.task3608.model;


/*
DataModel is the entity that will store the data we need to display to the client.
However, not all data is stored in a database. For example, a signed-in user will be stored in a special Model object.
An object that contains data required to display information to the client is called the Model.
Additionally, this Model object contains references to all of the required services.
If there is a lot of data to display, then it is broken out into separate objects.
 */

import com.codegym.task.task36.task3608.bean.User;

import java.util.List;

public class DataModel{
    private User activeUser;
    private List<User> users;
    private boolean displayDeletedUserList;

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
