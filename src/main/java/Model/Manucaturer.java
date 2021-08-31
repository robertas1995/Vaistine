package Model;

public class Manucaturer {

    int manufacturerId;
    String title;
    String address;
    Enum CountryEnum;

    public Manucaturer(int manufacturerId, String title, String address, Enum countryEnum) {
        this.manufacturerId = manufacturerId;
        this.title = title;
        this.address = address;
        CountryEnum = countryEnum;
    }
}



