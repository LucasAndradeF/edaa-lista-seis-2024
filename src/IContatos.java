public interface IContatos {

    public void adicionar(String nome, String telefone);

    public void listar();

    public Contact buscar(String nome, String telefone);

}
