package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userDaoHibernate = new UserServiceImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        System.out.println(userDaoHibernate.getAllUsers());
        userDaoHibernate.removeUserById(1);
//        userDaoHibernate.cleanUsersTable();
//        userDaoHibernate.dropUsersTable();
    }
}
