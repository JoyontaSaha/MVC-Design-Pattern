package com.codegym.task.task36.task3608.view;

/*
display the list of users
 */

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.controller.Controller;
import com.codegym.task.task36.task3608.model.DataModel;

public class UsersView implements View {
    private Controller controller;
    private User user = new User();

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }


    @Override
    public void refresh(DataModel dataModel) {
        if(dataModel.isDisplayDeletedUserList()) {
            System.out.println("All deleted users:");
            for (User user : dataModel.getUsers()) {
                System.out.println("\t" + user);
            }
            System.out.println("===================================================");
        }
        else {
            System.out.println("All users:");
            for (User user : dataModel.getUsers()) {
                System.out.println("\t" + user);
            }
            System.out.println("===================================================");
        }

    }

    /*
    emulates a client event.
    Access the controller and
    call the appropriate method to display all users
     */
    public void fireShowAllUsersEvent() {
        controller.onShowAllUsers();
    }


    public void fireOpenUserEditFormEvent(long id) {
        controller.onOpenUserEditForm(id);
    }

    public void fireShowDeletedUsersEvent() {
        controller.onShowAllDeletedUsers();
    }



}
