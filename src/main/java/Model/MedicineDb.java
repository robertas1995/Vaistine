package Model;

import java.sql.*;
import java.util.ArrayList;

public class MedicineDb {

        final String schemaName = "vaistine";
        final String connectionString = "jdbc:mysql://localhost:3306/" + schemaName + "?user=root&password=htcrio8s";

        public ArrayList<Medicine> printMedicines () throws Exception {

            ArrayList allMedicine = new ArrayList<Medicine>();


            try {
                Connection connection = DriverManager.getConnection(connectionString);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from vaistine.medicine");
                {
                    while (resultSet.next()) {
                        Medicine newMedicine = new Medicine(

                                resultSet.getInt("medicineId"),
                                resultSet.getString("title"),
                                resultSet.getString("manafacturer"),
                                resultSet.getInt("manafacturerId"),
                                resultSet.getString("medicineType"),
                                resultSet.getString("description"),
                                resultSet.getDouble("price")

                        );
                        System.out.println(newMedicine);
                        allMedicine.add(newMedicine);
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return allMedicine;
        }
    }

