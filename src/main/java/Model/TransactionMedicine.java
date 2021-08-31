package Model;

import java.util.UUID;

public class TransactionMedicine {
    UUID transactionId = UUID.randomUUID();
    int medicineId;

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int quantity;

    public TransactionMedicine(UUID transactionId, int medicineId, int quantity) {
        this.transactionId = transactionId;
        this.medicineId = medicineId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s ", this.transactionId, this.medicineId, this.quantity);
    }
}
