public class AppContact {
    public static void main(String[] args) throws Exception {
        ListaContatos contatos = new ListaContatos();

        System.out.println("Lista de contatos");
        contatos.adicionar("Maria", "999994545");
        contatos.adicionar("Lucas", "999999595");
        contatos.adicionar("João", "999998585");

        System.out.println("Buscar contatos na lista:");
        Contact encontrar = contatos.buscar("José", "999992525");
        encontrarContato(encontrar);
        Contact encontrarDois = contatos.buscar("Lucas", "999999595");
        encontrarContato(encontrarDois);

        System.out.println("\nListar os contatos da lista");
        contatos.listar();
    }

    public static void encontrarContato(Contact contato) {
        if (contato != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("O contato ");
            sb.append("----");
            sb.append(contato);
            sb.append("---- ");
            sb.append("foi encontrado na lista.");
            System.out.println(sb.toString());
        } else {
            System.out.println("O Contato não foi encontrado.");
        }

    }
}
