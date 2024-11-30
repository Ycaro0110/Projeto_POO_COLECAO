package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {

    public static Connection getConnection() throws SQLException {

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/colecao_notas", "root", "Ycaro123");

        return conn;
    }
}
