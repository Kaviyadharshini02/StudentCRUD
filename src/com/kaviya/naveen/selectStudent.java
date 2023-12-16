package com.kaviya.naveen;

import java.sql.*;

public class selectStudent {
    public static void select(Connection con) throws SQLException{
        Statement st = con.createStatement();
        String s = "SELECT * FROM studentdata";
        ResultSet rs = st.executeQuery(s);
        while(rs.next())
        {
            System.out.println("\nFirst Name:"+rs.getString(2)+"\nLast Name:"+rs.getString(3)+
                    "\nRegsiter number:" + " "+rs.getString(4)+"\nAge:"+rs.getInt(5)+"\nGender:"
                    +rs.getString(6)+"\nMother Name:"+
                    rs.getString(7)+"\nFather Name:"+rs.getString(8));
        }
        st.close();

    }
}
