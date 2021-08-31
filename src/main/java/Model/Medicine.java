package Model;

import java.time.LocalDate;
import java.util.List;

public class Medicine {
    int medicineId;
    String medicineTitle;
    String manafacturer;
    int manufacturerId;
    String MedicineTypeEnum;
    String description;
    List<Component> componentList;
    LocalDate createdTime;
    boolean childreanSafe;
    Double price;

    public  Medicine (){

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Medicine(int medicineId, String MedicineTitle, String manafactory, int manafactoryId, String medicineType, String description, Double price) {
        this.medicineId = medicineId;
        this.medicineTitle = MedicineTitle;
        this.manafacturer =  manafactory;
        this.manufacturerId = manafactoryId;
        this.description = description;
        this.price = price;


    }




    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineTitle() {
        return medicineTitle;
    }

    public void setMedicineTitle(String medicineTitle) {
        this.medicineTitle = medicineTitle;
    }

    public String getManucaturer() {
        return manafacturer;
    }

    public void setManucaturer(String manucaturer) {
        this.manafacturer = manucaturer;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getMedicineTypeEnum() {
        return MedicineTypeEnum;
    }

    public void setMedicineTypeEnum(String medicineTypeEnum) {
        MedicineTypeEnum = medicineTypeEnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

    public boolean isChildreanSafe() {
        return childreanSafe;
    }

    public void setChildreanSafe(boolean childreanSafe) {
        this.childreanSafe = childreanSafe;
    }



    @Override
    public String toString() {
        return String.format("%s %s %s %s %s ", this.medicineId, this.medicineTitle, this.manafacturer, this.manufacturerId,this.price );
    }
}
