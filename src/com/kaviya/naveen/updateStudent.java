package com.kaviya.naveen;
import java.sql.*;
public class updateStudent {
    public static void update (Connection con)throws SQLException{
        Statement st = con.createStatement();
        String upd ="UPDATE studentdata SET f_name ='divya' where reg_no='111923CS01030'";
        st.executeUpdate(upd);
        st.close();
    }

}
