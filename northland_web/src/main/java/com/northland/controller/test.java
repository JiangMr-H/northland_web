package com.northland.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {

    public static void main(String[] args) {

        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://111.229.115.51;databasename=test"; //1433是数据库的端口，"li"是你的数据库名称
        String userName = "sa"; //sa是数据库的超级用户，最好不要换别的名字，权限问题
        String userPwd = "Jzh666!."; //sa的密码

        Connection dbConn=null;
        try {
            Class.forName(driverName).newInstance();
            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("连接成功!");

        }
        catch (Exception e) {
            e.printStackTrace();
        }finally{

            try {
                if(dbConn!=null)
                    dbConn.close();
            } catch (SQLException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
