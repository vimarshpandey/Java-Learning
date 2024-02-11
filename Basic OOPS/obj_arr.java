class Car
{
    String name;

    Car(String n)
    {
        this.name = n;
    }
}

public class obj_arr
{
    public static void main(String[] args)
    {
        Car[] cararr = new Car[3];

        Car c1 = new Car("Ford");
        Car c2 = new Car("Audi");
        Car c3 = new Car("Mercedes");

        cararr[0] = c1;
        cararr[1] = c2;
        cararr[2] = c3;

        System.out.println(cararr[0].name);
        System.out.println(cararr[1].name);
        System.out.println(cararr[2].name);
    }
}
