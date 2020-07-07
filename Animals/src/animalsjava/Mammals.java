package animalsjava;

public class Mammal extends Animal{

	public Mammal(String name, int yearDiscovered){
		super(name, yearDiscovered);
	}

	@Override
	public String canBreath(){
		return "Lungs";
	}

	@Override
	public String canMove(){
		return "Walk";
	}

	@Override 
	public String makeBabies(){
		return "Live Births";
	}

	@Override
	public String toString(){
		return name + " " + makeBabies() + " " + canMove() + " " + yearDiscovered + "\n";
	}


}