package com.kaviya.naveen;
import java.util.*;
import java.sql.*;
import java.sql.Statement;

public class addStudent {
    public static void insertStudent(Connection con) throws SQLException {
       // Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("First name:");
        String f_name=sc.next();
        System.out.println("Last name:");
        String l_name=sc.next();
        System.out.println("Register No:");
        String reg_no=sc.next();
        System.out.println("Age:");
        int age=sc.nextInt();
        System.out.println("Gender:");
        String gender=sc.next();
        System.out.println("Mother name:");
        String mother=sc.next();
        System.out.println("Father name:");
        String father=sc.next();
        String ins ="INSERT INTO studentdata(f_name,l_name,reg_no,age,gender,mother,father) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(ins);
        ps.setString(1,f_name);
        ps.setString(2,l_name);
        ps.setString(3,reg_no);
        ps.setInt(4,age);
        ps.setString(5,gender);
        ps.setString(6,mother);
        ps.setString(7,father);
        ps.executeUpdate();
        ps.close();



    }
}
