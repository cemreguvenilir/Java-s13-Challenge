package employeeApp;

public enum Plan {
    BRONZE("Bronze Plan", 100),
    SILVER("Silver Plan", 200),
    GOLD("Gold Plan", 300);

    private String name;
    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan name= " + getName() + "price= " + getPrice();

    }
}
