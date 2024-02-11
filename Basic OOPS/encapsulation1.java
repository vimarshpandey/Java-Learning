class chair
{
    private String name;
    private int price;

    chair(String n, int p)
    {
        this. name = n;
        this.price = p;
    }

    public String getName()     // getter method is used to retrive the value of private
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setName(String n)   // setter method is used to set / change the value of private
    {
        this.name = n;
    }

    public void setPrice(int p)
    {
        this.price = p;
    }
}

public class encapsulation1
{
    public static void main(String[] args)
    {
        chair c1 = new chair("Recliner", 15000);

        c1.setPrice(12000);

        System.out.println(c1.getName());
        System.out.println(c1.getPrice());
    }    
}
