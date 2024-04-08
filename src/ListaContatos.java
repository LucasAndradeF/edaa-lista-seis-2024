import java.util.ArrayList;

public class ListaContatos implements IContatos {
    private ArrayList<Contact> contatos = new ArrayList<>();

    @Override
    public void adicionar(String nome, String telefone) {
        contatos.add(new Contact(nome, telefone));
    }

    @Override
    public void listar() {
        for (Contact contato : contatos) {
            System.out.println(contato);
        }
    }

    @Override
    public Contact buscar(String nome, String telefone) {
        for (Contact contato : contatos) {
            if (contato.getName().equals(nome) && contato.getTelephone().equals(telefone)) {
                return contato;
            }
        }
        return null;
    }
}
