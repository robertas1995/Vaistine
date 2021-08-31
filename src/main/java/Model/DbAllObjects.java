package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class DbAllObjects {
    final String schemaName = "vaistine";
    final String connectionString = "jdbc:mysql://localhost:3306/" + schemaName + "?user=root&password=htcrio8s";


        public ArrayList<Customer> printCustomers () throws Exception{
        ArrayList allCustomer = new ArrayList<Customer>();

        try {
            Connection connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from vaistine.custumer");
            {
    while (resultSet.next()){
        Customer newCustomer = new Customer(

         resultSet.getInt("customerId"),
         resultSet.getString("firstName"),
         resultSet.getString("lastName"),
         resultSet.getString("email"),
         resultSet.getString("gender"),
         resultSet.getDate("birthDate")

        );
        //System.out.println(newCustomer);
        allCustomer.add(newCustomer);
    }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allCustomer;
    }

}
