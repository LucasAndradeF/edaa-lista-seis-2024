import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppName {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("João", 25));
        listaPessoas.add(new Pessoa("Maria", 30));
        listaPessoas.add(new Pessoa("Pedro", 20));
        listaPessoas.add(new Pessoa("Ana", 22));
        listaPessoas.add(new Pessoa("Daniel", 31));
        listaPessoas.add(new Pessoa("Lucas", 18));

        System.out.println("Pessoas ordenadas por idade:");
        Collections.sort(listaPessoas, (Pessoa pessoaOne, Pessoa pessoaTwo) -> pessoaOne.getAge() - pessoaTwo.getAge());
        listaPessoas.forEach(Pessoa -> System.out.println(Pessoa));
    }
}