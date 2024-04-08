import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppCountries {
    public static void main(String[] args) {
        List<Pais> listaPaises = new ArrayList<Pais>();
        listaPaises.add(new Pais("Brasil"));
        listaPaises.add(new Pais("Argentina"));
        listaPaises.add(new Pais("Chile"));
        listaPaises.add(new Pais("Uruguai"));
        listaPaises.add(new Pais("Portugal"));
        listaPaises.add(new Pais("Bolívia"));
        listaPaises.add(new Pais("China"));
        listaPaises.add(new Pais("Estados Unidos"));
        listaPaises.add(new Pais("França"));
        listaPaises.add(new Pais("Japão"));
        listaPaises.add(new Pais("Coréia"));
        System.err.println("Lista de países ordenados:");
        Collections.sort(listaPaises, (Pais countryOne, Pais countryTwo) -> countryOne.getName().compareTo(countryTwo.getName()));
        listaPaises.forEach(Pais -> System.out.println(Pais.getName()));
    }
}
