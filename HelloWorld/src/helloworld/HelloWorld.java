package helloworld;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://NSVMWEB\\MSSQLSERVER:1433;databaseName=MistDB;selectMethod=cursor", "MistDB_User", "mist");
            stmt = conn.createStatement();
//            rs = stmt.executeQuery("SELECT * FROM Category");
            rs = stmt.executeQuery("uspGetAllCategories");
            while (rs.next()) {
                System.out.println(rs.getString("CategoryId") + "\t" + rs.getString("Code") + "\t" + rs.getString("Description"));
            }

        } catch (Exception ex) {
            Logger.getLogger(HelloWorld.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs = null;
            stmt = null;
            conn = null;
        }
    }
}
