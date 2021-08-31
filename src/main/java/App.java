import FraimFolder.Frame;
import Model.*;


import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        DbAllObjects cdb = new DbAllObjects();
        MedicineDb mdb = new MedicineDb();


        try{
          mdb.printMedicines();
           cdb.printCustomers();

        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Customer> customer = new ArrayList<Customer>();
        ArrayList<Medicine> medicine = new ArrayList<Medicine>();
        ArrayList<Transaction> transactionsArrayList = new ArrayList<Transaction>();


        new Frame();



    }
}
