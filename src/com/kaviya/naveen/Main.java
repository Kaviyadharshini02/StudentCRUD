package com.kaviya.naveen;
import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root22");
            Scanner sc = new Scanner(System.in);
            int val;
            do{
                System.out.println("4.Insert"+"\n3.Update"+"\n2.Select"+"\n1.Delete"+"\n0.exit");
                 val= sc.nextInt();

                switch(val){
                    case 0 :
                        System.out.println("exited...........");
                        break;
                    case 4:
                        addStudent.insertStudent(con);
                        break;
                    case 3:
                        updateStudent.update(con);break;
                    case 2:
                        selectStudent.select(con);break;
                    case 1:
                        deleteStudent.delete(con);break;
                    default:
                        System.out.println("Invalid input");

                }

            }
            while(val>0);
        }
        catch(SQLException e){
            System.out.println(e);
    }

    }
}