package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext 
    {
        protected  Connection connection;
        
        public DBContext() 
            {
                try 
                    {
                        String url = "jdbc:sqlserver://localhost:1433; databasename = ProgressTest1_DB";
                        String uid = "sa";
                        String pwd = "123456789";
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        connection = DriverManager.getConnection(url, uid, pwd);
                    } 
                catch (ClassNotFoundException | SQLException e) 
                    {
                        System.out.println(e);
                    }
            }
    }