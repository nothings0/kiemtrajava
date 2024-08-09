/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhan.data.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nhan.utils.Constants;
/**
 *
 * @author pv
 */
public class MysqlDriver {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                return DriverManager.getConnection(Constants.DB_URL, Constants.USER, Constants.PASS);
            } catch (SQLException ex) {
                Logger.getLogger(MysqlDriver.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
