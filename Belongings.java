package application;
public class Belongings {
    String Customer_name, type;
    int no_of_items;

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNo_of_items() {
        return no_of_items;
    }

    public void setNo_of_items(int no_of_items) {
        this.no_of_items = no_of_items;
    }
}
