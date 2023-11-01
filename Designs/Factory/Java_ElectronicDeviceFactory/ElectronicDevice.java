public abstract class ElectronicDevice {
    private String brand;
    private String model;
    private Integer price;
    private String description;

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return this.model;
    }
    public Integer getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    abstract String Summery();
}

enum Devices {
    SMARTPHONE,
    TABLET,
    LAPTOP
}

class Smartphone extends ElectronicDevice {

    public Smartphone(String model, Integer price, String description) {
        this.setModel(model);
        this.setPrice(price);
        this.setDescription(description);
    }

    @Override
    String Summery() {
        return String.format(">> Smartphone <<\nBrand: %s\nModel: %s\nPrice: $%d\nDescription: %s\n", this.getBrand(), this.getModel(), this.getPrice(), this.getDescription());
    }
}
class Tablet extends ElectronicDevice {

    public Tablet(String model, Integer price, String description) {
        this.setModel(model);
        this.setPrice(price);
        this.setDescription(description);
    }

    @Override
    String Summery() {
        return String.format(">> Tablet <<\nBrand: %s\nModel: %s\nPrice: $%d\nDescription: %s\n", this.getBrand(), this.getModel(), this.getPrice(), this.getDescription());
    }
}

class Laptop extends ElectronicDevice {

    public Laptop(String model, Integer price, String description) {
        this.setModel(model);
        this.setPrice(price);
        this.setDescription(description);
    }

    @Override
    String Summery() {
        return String.format(">> Laptop <<\nBrand: %s\nModel: %s\nPrice: $%d\nDescription: %s\n", this.getBrand(), this.getModel(), this.getPrice(), this.getDescription());
    }
}
