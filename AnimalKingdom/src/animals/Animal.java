package animals;

abstract class Animal 
{
    protected static int maxId = 1;
    protected int id;
    protected String name;
    protected int yearNamed;
    protected String move;
    protected String breath;
    protected String reproduce;

    public Animal(String name, int yearNamed, String move, String breath, String reproduce)
    {
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
        this.move = move;
        this.breath = breath;
        this.reproduce = reproduce;
    }

    public int getId() 
    {
        return id;
    }

    
}