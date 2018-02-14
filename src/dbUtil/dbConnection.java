package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private static final String SQCONN="jdbc:school.sqlite";

    public static Connection getconnection(){
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }//getconnection
}//class
