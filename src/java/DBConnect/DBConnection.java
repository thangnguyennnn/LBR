package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public Connection getConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://" + "localhost" + ":1433"+ ";instance=" + "SQLEXPRESS" + ";databaseName=" + "ManagerLBR";
            Connection conn = DriverManager.getConnection(url,"sa","12");
        return conn; 
    }
    public static void main(String[] args) throws Exception {
        DBConnection d = new DBConnection();
        System.out.println(d.getConnection());
    }
}
