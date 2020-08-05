package animalsjava;

public class Bird extends Animal
{

    public Bird(
        String name,
        int yearDiscovered)
    {
        super(name,
            yearDiscovered);
    }

    @Override
    public String canBreath()
    {
        return "Lungs";
    }

    @Override
    public String canMove()
    {
        return "Fly";
    }

    @Override
    public String makeBabies()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return name + " " + makeBabies() + " " + canMove() + " " + yearDiscovered + "\n";

    }
}