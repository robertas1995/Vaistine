package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.UUID;

public class Transaction extends Customer{
    UUID transactionId = UUID.randomUUID();
    int customerId;
    LocalDate data;
    double totalPrice;
    int discount;


    public Transaction(UUID transactionId, int customerId, LocalDate data, double totalPrice, int discount) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.data = data;
        this.totalPrice = totalPrice;
        this.discount = discount;
    }

    public Transaction(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public Transaction() {
        this(UUID.randomUUID());
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }



    public int createtransaction() throws Exception {
        String query = "INSERT INTO vaistine.transactions (customerId,totalPrice,discount)" +
                "VALUES" +
                "('"+getCustomerId()+"','"+this.getTotalPrice()+"','"+this.getDiscount()+"')";
        int rowsAffected = 0;

        final String schemaName = "vaistine";
        final String connectionString = "jdbc:mysql://localhost:3306/" + schemaName + "?user=root&password=htcrio8s";
        try(
                Connection connection = DriverManager.getConnection(connectionString);
                Statement statement = connection.createStatement();
        ) {
            rowsAffected = statement.executeUpdate(query);

        }catch(Exception exc) {
            System.out.println("DB Error!"+exc.getMessage());
        }
        System.out.println(rowsAffected);

        return rowsAffected;

    }


    @Override
    public String toString() {
        return String.format("%s %s %s %s %s ", this.transactionId, this.customerId, this.data, this.totalPrice,this.discount );
    }

}
