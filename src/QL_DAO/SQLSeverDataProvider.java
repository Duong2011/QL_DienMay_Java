/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SQLSeverDataProvider {

    Connection connection = null;

    public void open() {

        try {
            String strSever = "DESKTOP-POLM6SU\\SQLEXPRESS";
            String strDatabase = "QL_DienMay_ID";
            String struser = "sa";
            String strpass = "sa";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver);
            String conURL = "jdbc:sqlserver://" + strSever
                    + ":1466;databaseName=" + strDatabase
                    + ";user=" + struser
                    + ";password=" + strpass + ";encrypt=true;trustServerCertificate=true";

            try {
                connection = DriverManager.getConnection(conURL);
            } catch (SQLException ex) {
                Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (connection != null) {
                System.out.println("Ket noi thanh cong");
            } else {
                System.out.println("Ket noi that bai");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet executeQuery(String sql) {
        ResultSet resultSet = null;
        Statement statement;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }

    public int executeUpdate(String sql) {
        int n = -1;
        try {
            Statement statement = connection.createStatement();
            n = statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;

    }
   

}
