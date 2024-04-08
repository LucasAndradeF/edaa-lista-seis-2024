public interface IBuy {

    public Buy add(String name, int quantity, double price);

    public void list();

    public Buy remove(String name, int quantity);

}
