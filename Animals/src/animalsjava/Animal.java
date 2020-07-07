package animalsjava;

abstract class Animal{

	protected static int maxId;
	protected int food;
	protected int id;
	protected String name;
	protected int yearDiscovered;

	abstract String canBreath();
	abstract String canMove();
	abstract String makeBabies();

	void eatFood(int i){
		this.food -= food;
	}

	String getName(){
		this.name = name;
	}

	int getYear(){
		rseturn yearDiscovered;
	}

	public Animal(String name, int yearDiscovered){
		id = maxId++;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}
	
	
}