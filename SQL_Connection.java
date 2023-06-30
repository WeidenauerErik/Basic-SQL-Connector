package com.example.studybuddy.SQL;

import java.io.IOException;
import java.sql.*;

public class SQL_Connection {

    public static Connection getSQL_Connection() throws IOException, SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TableName", "User", "Passwort");
        if (con != null) return con;
        else throw new IOException("Database Connection failed");
    }

}
