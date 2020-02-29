package ru.artem.sportcom.sportcom.app;

import java.sql.*;

public class SportcomApp {

    static final String URL = "jdbc:postgresql://127.0.0.1:5432/sportcom";
    static final String USER = "postgres";
    static final String PASS = "";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            System.out.println("Соединяемся с базой");
            connection = DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Нет соединения");
            e.printStackTrace();
            return;
        }
        System.out.println("Всё гуд");
    }

}