package animalsjava;

abstract class Animal
{

    protected static int maxId;

    protected int food;

    protected int id;

    protected String name;

    protected int yearDiscovered;

    abstract String canBreath();

    abstract String canMove();

    abstract String makeBabies();

    void eatFood(int i)
    {
        this.food -= food;
    }

    String getName()
    {
        return name;
    }

    int getYear()
    {
        return yearDiscovered;
    }

    int getId() {
        return id;
    }

    public Animal(
        String name,
        int yearDiscovered)
    {
        id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    @Override
    public String toString()
    {
        return "Animals{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", yearDiscovered=" + yearDiscovered +
            '}' + '\n';
    }


}