package animalsjava;

import java.util.ArrayList;
import java.util.List;

public class Main{

	private static List<Animal> filteredList = new ArrayList<>();

	private static void filteredAnimals(List<Animal> animals, CheckAnimal check, boolean printThis){

		List<Animal> filteredAnimalList = new ArrayList<>();
		for(Animal a : animals){
			if(check.check(a)){
				if(printThis){
					System.out.println(a.getName() + " " + a.makeBabies() + " " + a.canMove() + " " + a.canBreath() + " " +  a.getYear());
				}
				filteredAnimalList.add(a);			}
		}
	}

	public static void main(String[] args){
		System.out.println("Check out my animals!!");

		List<Animal> animalList = new ArrayList<>();

		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("BigFoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);


		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

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

		System.out.println("*** MVP ***");
		System.out.println();
		System.out.println("*** List all of the animals in descending order by year named ***");


		animalList.sort((animal1, animal2) -> Integer.valueOf(animal2.getYear()).compareTo(animal1.getYear()));
		System.out.println(animalList.toString());
		System.out.println();
		System.out.println();

		System.out.println("**** List all the animals alphabetically ***");
		animalList.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
		System.out.println(animalList.toString());
		System.out.println();

		System.out.println("*** List all the animals order by how they move  ***");
		animalList.sort((animal1, animal2) -> animal1.canMove().compareToIgnoreCase(animal2.canMove()));
		System.out.println(animalList.toString());
		System.out.println();

		System.out.println("*** List only those animals that breath with lungs ***");
		filteredAnimals(animalList, a -> a.canBreath() == "Lungs", true);
		System.out.println();

		System.out.println("*** List only those animals that breath with lungs and were named in 1758***");
		filteredAnimals(animalList, a -> (a.canBreath() == "Lungs") && (a.getYear() == 1758), true);
		System.out.println();

		System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
		filteredAnimals(animalList, a -> (a.makeBabies() == "Eggs") && (a.canBreath() == "Lungs"), true);
		System.out.println();

		System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
		filteredAnimals(animalList, a -> (a.getYear() == 1758), true);









	}

}