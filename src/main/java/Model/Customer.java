package Model;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    int customerId;
    String firstName;
    String lastName;
    String email;
    Enum gender;
    Date birthDate;

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }






   // ArrayList<Transaction> transactionArrayList;

    public Customer(int customerId, String firstName, String lastName, String email, String gender, Date birthDate) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        //this.gender= gender;
        this.birthDate = birthDate;
       // this.transactionArrayList = transactionArrayList;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s ", this.customerId, this.firstName, this.lastName, this.email, this.birthDate );
    }
}
