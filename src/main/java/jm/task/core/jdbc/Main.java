package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Max", "Satyshev", (byte) 22);
        userService.saveUser("Tatyana", "Samokhina", (byte) 60);
        userService.saveUser("Larisa", "Pogozheva", (byte) 50);
        userService.saveUser("Taisiya", "Khalilova", (byte) 26);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
