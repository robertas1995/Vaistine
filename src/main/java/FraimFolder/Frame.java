package FraimFolder;

import EnumsPackage.MedicineTypeEnum;
import Model.*;
import Model.Component;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class Frame {
    ArrayList<Transaction> transactionArrayList = new ArrayList<Transaction>();



    public Frame() throws Exception {


        DbAllObjects database = new DbAllObjects();
        MedicineDb medicineDatabase = new MedicineDb();

        JFrame frame = new JFrame("Euro vaistinė");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 800);
        frame.setBackground(Color.getHSBColor(244, 244, 244));
        frame.setLayout(new GridLayout(10, 1));
        // klientu list
        JPanel klientuList = new JPanel();
        JLabel pasirinktiKlienta = new JLabel("pasirinkite klienta");
        klientuList.setLocation(80,80);
        klientuList.setBackground(Color.green);

        JComboBox klientaiComboBox = new JComboBox (database.printCustomers().toArray());
        klientuList.add(pasirinktiKlienta);
        klientuList.add(klientaiComboBox);

        JPanel vaistuList = new JPanel();
        JLabel pasirinkite = new JLabel("pasirinkite vaistus");
        vaistuList.setLocation(60,60);
        vaistuList.setBackground(Color.GREEN);
        JComboBox vaistai = new JComboBox(medicineDatabase.printMedicines().toArray());
        vaistuList.add(pasirinkite);
        vaistuList.add(vaistai);
        JPanel purchaseButton = new JPanel();
        purchaseButton.setLocation(100,100);
        purchaseButton.setBackground(Color.green);
        JButton purchase = new JButton("Purchase");
        purchase.setSize(10,15);
        purchaseButton.add(purchase);

        //Paspaudus mygtuką “Purchase” atsirastų įrašas duomenų bazėje, apie tai kad įvyko užsakymas.

        frame.add(klientuList);
        frame.add(vaistuList);
        frame.add(purchaseButton);
        frame.setVisible(true);
        Transaction transaction = new Transaction();
        purchase.addActionListener(e -> {
            Customer selecedCustomer = Customer.class.cast(klientaiComboBox.getItemAt(klientaiComboBox.getSelectedIndex()));
            Medicine selecedMedicine = Medicine.class.cast(vaistai.getItemAt(vaistai.getSelectedIndex()));
            System.out.println(selecedCustomer.getFirstName() + " "
                    + selecedCustomer.getLastName()+" "
                    + selecedMedicine.getMedicineTitle()+" "
                    + selecedMedicine.getPrice());
           // TransactionMedicine transmed = new TransactionMedicine(transaction.getTransactionId(), selecedMedicine.getMedicineId(),1);
            //transaction.setData(LocalDate.now());
            //System.out.println(transaction.getData().atTime(LocalTime.now()));
            Transaction selectedTransaction = new Transaction(transaction.getTransactionId(),selecedCustomer.getCustomerId(),transaction.getData(), selecedMedicine.getPrice(), transaction.getDiscount());
            System.out.println(selectedTransaction);

            transactionArrayList.add(selectedTransaction);

            try {
                selectedTransaction.createtransaction();
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

    }

    private String[] listToStringArray(ArrayList<Object> source) {

        String[] strings = new String[source.size()];

        for(int i = 0; i < source.size() ; i++) {
            strings[i] = source.get(i).toString();
        }

        return strings;
    }

    private void loadMedicinesData(ArrayList<Medicine> medicines) {



        //Manucaturer gamintojas1 = new Manucaturer();


    }


}




