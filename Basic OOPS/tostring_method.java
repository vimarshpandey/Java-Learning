class Car
{
    String name = "Mustang";
    int price = 1000001;

    public String toString()
    {
        String mystr = name + "\n" + price;
        return mystr;
    }
}

public class tostring_method
{
    public static void main(String[] args)
    {
        Car c1 = new Car();

        System.out.println(c1);  // using toString method implicitelt
        System.out.println(c1.toString());  // using toString method explicetly

        // both the method will give the address of the "car" object
        // and if we override the toString method in the Car class the it will show the object textually.
    }
}
