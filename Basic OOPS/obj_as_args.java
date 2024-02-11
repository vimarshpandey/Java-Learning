class Car
{
    String name;

    Car(String n)
    {
        this. name = n;
    }
}

class Cycle
{
    String name;

    Cycle(String n)
    {
        this. name = n;
    }
}

class Gurage
{
    void park(Car cars, Cycle cycles)
    {
        System.out.println("The car "+cars.name+" and "+cycles.name+" is parked.");
    }
}

public class obj_as_args
{
    public static void main(String[] args)
    {
        Gurage guarge = new Gurage();

        Car c1 = new Car("BMW");
        Car c2 = new Car("Audi");

        Cycle cy1 = new Cycle("Herculis");
        Cycle cy2 = new Cycle("Avon");

        guarge.park(c1, cy1);
        guarge.park(c2, cy2);
    }
}
