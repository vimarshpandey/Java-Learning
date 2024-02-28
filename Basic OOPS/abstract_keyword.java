abstract class furniture       // abstract class, cannot instanciate an obj of this class
{
    String name;
    int legs;

    furniture(String n, int l)
    {
        this.name = n;
        this.legs = l;
    }

    abstract void price();
}

class chair extends furniture
{
    String material;

    chair(String n, String m, int l)
    {
        super(n, l);
        this.material = m;
    }

    @Override
    void price()
    {
        System.out.println("The price of the chair whose name is "+this.name+" and the material is "+this.material+" is low.");
    }
}

public class abstract_keyword
{
    public static void main(String[] args)
    {
        chair c1 = new chair("Recliner", "Plastic", 4);

        c1.price();
    }    
}
