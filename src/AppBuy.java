public class AppBuy {
    public static void main(String[] args) throws Exception {
        BuyList buyList = new BuyList();

        System.out.println("Lista de Compras");
        buyList.add("Computador", 2, 5000.00);
        buyList.add("Tv", 10, 15000.00);
        buyList.add("Máquina de Lavar", 1, 999.50);

        System.out.println("Listar os produtos da lista");
        buyList.list();

        System.out.println("\nRemover os produtos da lista:");
        Buy removeProduct = buyList.remove("Máquina de Lavar", 1);
        removeProduct(removeProduct);
        Buy removeProductTwo = buyList.remove("Tv", 10);
        removeProduct(removeProductTwo);

    }

    public static void removeProduct(Buy buy) {
        if (buy != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("O Produto ");
            sb.append("----");
            sb.append(buy.getName());
            sb.append("---- ");
            sb.append("foi removido da lista.");
            System.out.println(sb.toString());  
        } else {
            System.out.println("O produto não foi encontrado na lista.");
        }

    }
}
