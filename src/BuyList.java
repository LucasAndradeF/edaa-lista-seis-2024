import java.util.ArrayList;

public class BuyList implements IBuy {

    private ArrayList<Buy> buyList = new ArrayList<>();

    @Override
    public Buy remove(String name, int quantity) {
        for (Buy buy : buyList) {
            if (buy.getName().equals(name) && buy.getQuantity() == quantity) {
                buyList.remove(buy);
                return buy;
            }
        }
        return null;
    }

    @Override
    public Buy add(String name, int quantity, double price) {
        Buy newBuy = new Buy(name, quantity, price);
        buyList.add(newBuy);
        return newBuy;
    }

    @Override
    public void list() {
        for (Buy buy : buyList) {
            System.out.println(buy);
        }
    }

}
