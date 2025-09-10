package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        System.out.println("Таблица создана");

        userService.saveUser("Petr", "Sidorov",(byte) 42);
        System.out.println("User с именем Petr добавлен в таблицу");
        userService.saveUser("Gor", "Sirov",(byte) 34);
        System.out.println("User с именем Gor добавлен в таблицу");
        userService.saveUser("Any", "Sidorova",(byte) 31);
        System.out.println("User с именем Any добавлен в таблицу");
        userService.saveUser("Rus", "Orov",(byte) 20);
        System.out.println("User с именем Rus добавлен в таблицу");

        List <User> users = userService.getAllUsers();
        System.out.println("Все пользователи из таблицы");
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        System.out.println("Таблица очищена");

        userService.dropUsersTable();
        System.out.println("Таблица удалена");
    }
}
