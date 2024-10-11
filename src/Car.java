public class Car {
    public Car() {
    }

    public Car(String model, String color, int prise, boolean isAutomatic) {
        this.model = model;
        this.color = color;
        this.price = prise;
        this.isAutomatic = isAutomatic;
    }


    private String model;
    private String color;
    private int price;
    private boolean isAutomatic;

    public void getCarInfo() {
        String transmissionType = isAutomatic ? "Automatic" : "Manual";
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car price: $" + price);
        System.out.println("Transmission type: " + transmissionType);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrise(int prise) {
        this.price = price;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrise() {
        return price;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }


}
