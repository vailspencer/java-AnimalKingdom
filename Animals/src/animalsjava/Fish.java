package animaljava;

public class Fish extends Animals{
	public Fish(String name, int yearDiscovered){
		super(name, yearDiscovered);
	}

	@Override
	public String canBreath(){
		return 'Gills';
	}

	@Override
	public String canMove(){
		return "Swim";
	}

	@Override
	public String makeBabies(){
		return "Eggs";
	}

	@Override
	public String toString(){
		return name + " " + makeBabies() + " " + canMove() + " " + yearDiscovered + "\n";
	}
}