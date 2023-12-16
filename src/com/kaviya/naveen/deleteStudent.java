package com.kaviya.naveen;
import java.sql.*;
import java.util.*;
public class deleteStudent {
    public static void delete(Connection con) throws SQLException{
        Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the register no of the row you have to delete:");
        String d =sc.next();
        String del = "DELETE FROM studentdata WHERE reg_no="+"'"+d+"'";
       // System.out.println(del);
        System.out.println(del);
        PreparedStatement pt = con.prepareStatement(del);
        //pt.setString(3,);
        st.executeUpdate(del);
        st.close();


    }
}
