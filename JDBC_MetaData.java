import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            //1. load driver
              Class.forName("com.mysql.cj.jdbc.Driver");
            //2. to get a connection  (3params - url,user,password)
        Connection connection= DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/bookdatabase","root","9845003308rR@");

            //3. create statement
            Statement statement=connection.createStatement();

            //4. execute query
            ResultSet resultSet=statement.executeQuery("select *from book;");
            ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
            System.out.println("Total no. of columns: "+resultSetMetaData.getColumnCount());
            System.out.println("3rd row and type: "+resultSetMetaData.getColumnName(3)+" "
            +resultSetMetaData.getColumnType(3));


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
