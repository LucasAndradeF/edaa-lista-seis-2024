public class Buy {
    private String name;
    private int quantity;
    private double price;

    public Buy() {
    }

    public Buy(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto: ");
        sb.append(name);
        sb.append(", quantidade: ");
        sb.append(quantity);
        sb.append(", ");
        sb.append("preço R$");
        sb.append(String.format("%.2f", price));
        sb.append(".");
        return sb.toString();
    }
}
