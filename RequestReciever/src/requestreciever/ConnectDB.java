
package requestreciever;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectDB {
    Connection conn;
    public ConnectDB(){
        try {
            //Class.forName("org.mariadb.jdbc.MySQLDataSource");
            Class.forName("org.sqlite.JDBC");
            try {
                //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "000111");
                conn = DriverManager.getConnection("jdbc:sqlite:requests.db");
            } catch (SQLException ex) {
                System.out.println("SQL Exception");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConn(){
        return conn;
    }
}
