import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
/*
import package
load and register
create connection
create statement
execute statement
process the result
close
 */
        int sid = 102;
        String sname = "Khristya";
        int marks = 99;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Cybersql0911";
        String sql = "insert into student values (?,?,?)";

        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);


        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute();


        con.close();

    }


}
