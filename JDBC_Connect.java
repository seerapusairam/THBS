import java.sql.*;

public class Main {
    public static void main(String [] args) throws ClassNotFoundException, SQLException {

        //1. load driver
        //  Class.forName("com.mysql.cj.jdbc.Driver");
        //2. to get a connection  (3params - url,user,password)
//        Connection connection= DriverManager.getConnection(
//           "jdbc:mysql://localhost:3306/bookdatabase","root","9845003308rR@"
//        );
        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hr","root","9845003308rR@"
        );
        //3. create statement
        Statement statement=connection.createStatement();

        //4. execute query
        ResultSet resultSet=statement.executeQuery("select *from countries;");

        //5. execute rows from result set
        while(resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+
                    resultSet.getString(2)+" "+resultSet.getString(3) );
        }



    }
}
