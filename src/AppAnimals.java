import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppAnimals {
    public static void main(String[] args) {
        List<Animal> listaAnimais = new ArrayList<Animal>();
        listaAnimais.add(new Animal("Jacaré"));
        listaAnimais.add(new Animal("Leão"));
        listaAnimais.add(new Animal("Girafa"));
        listaAnimais.add(new Animal("Elefante"));
        listaAnimais.add(new Animal("Zebra"));
        listaAnimais.add(new Animal("Cachorro"));
        listaAnimais.add(new Animal("Gato"));
        listaAnimais.add(new Animal("Cobra"));
        listaAnimais.add(new Animal("Morcego"));

        System.out.println("Lista de animais ordenados:");

        Collections.sort(listaAnimais,
                (Animal animalOne, Animal animalTwo) -> animalOne.getName().compareTo(animalTwo.getName()));
        listaAnimais.forEach(animal -> System.out.println(animal.getName()));
    }
}
