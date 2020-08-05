package animalsjava;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static List<Animal> filteredList = new ArrayList<>();

    public static void filterAnimal(List<Animal> animals, CheckAnimal animaltest)
    {
        for (Animal animal : animals)
        {
            filteredList.clear();
            if (animaltest.check(animal))
            {
                System.out.println(animal);
                filteredList.add(animal);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("it is working");

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);


        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);


        System.out.println("\n*** List all the animals in descending order by year named ***");
        animalList.sort((param1, param2) -> param2.getYear() - param1.getYear());
        for (Animal animal : animalList)
        {
            System.out.println(animal.getName() + "'s Id: " + animal.getId() + ", year named: " + animal.getYear());
        }

        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((param1, param2) -> param1.getName().compareToIgnoreCase(param2.getName()));
        for (Animal animal : animalList)
        {
            System.out.println(animal.getName() + "'s Id: " + animal.getId() + ", year named: " + animal.getYear());
        }


        System.out.println("\n*** List all the animals order by how they move ***");
        animalList.sort((param1, param2) -> param1.canMove().compareToIgnoreCase(param2.canMove()));
        for (Animal animal : animalList)
        {
            System.out.println(animal.getName() + "'s Id: " + animal.getId() + ", year named: " + animal.getYear());
        }

        System.out.println("\n*** List only those animals the breath with lungs ***");
        filterAnimal(animalList, animal -> animal.canBreath()=="Lungs");

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filterAnimal(animalList, animal -> animal.canBreath()=="Lungs" && animal.getYear()==(1758));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        filterAnimal(animalList, animal -> animal.makeBabies()=="Eggs" && animal.canBreath()=="Lungs");;

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        animalList.sort((param1, param2) -> param1.getName().compareToIgnoreCase(param2.getName()));
        filterAnimal(animalList, animal -> (animal.getYear() == 1758));
    }

}