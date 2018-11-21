package com.cloudo.study;

import java.sql.*;

public class DatabaseUtil {


    public void disDBQuery(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.79.169.27:3306/freereport_dev";
            conn = DriverManager.getConnection(url,"freereport2_dev","freereport2_dev*1");


            String sql = "select * from fr2_User where id >?";

            ps = conn.prepareStatement(sql);
            ps.setInt(1,0);
            rs = ps.executeQuery();

            while(rs.next()){

                System.out.println(rs.getString(3));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            if(rs!=null){

                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(ps!=null){

                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){

                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args){


    }
}
