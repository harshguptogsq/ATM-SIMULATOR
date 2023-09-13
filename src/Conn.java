import java.sql.*;
//import java.sql.DriverManager;
// import com.mysql.jdbc.Connection;
// import com.mysql.jdbc.Statement;
public class Conn {

    Connection c;
    Statement s;
     public Conn()
     {
        try
        {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Harsh@2023");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     }
}
