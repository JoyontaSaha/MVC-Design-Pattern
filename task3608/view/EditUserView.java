package com.codegym.task.task36.task3608.view;

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.controller.Controller;
import com.codegym.task.task36.task3608.model.DataModel;

public class EditUserView implements View {
    private Controller controller;

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void refresh(DataModel dataModel) {
        System.out.println("User to be edited:");
        User user = dataModel.getActiveUser();
        System.out.println("\t" + user);
        System.out.println("===================================================");
    }

    public void fireUserDeletedEvent(long id) {
        controller.onDeleteUser(id);
    }

    public void fireUserDataChangedEvent(String name, long id, int level) {
        controller.onChangeUserData(name, id, level);
    }
}
