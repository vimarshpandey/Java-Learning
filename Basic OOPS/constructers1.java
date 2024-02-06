class car
{
    String model;
    String color;
    int price;

    car(String m, String c, int p)
    {
        this.model = m;
        this.color = c;
        this.price = p;
    }

    void carinfo()
    {
        System.out.println("The model of the car is "+this.model+"\nThe color of the car is "+this.color+"\nThe price of the car is "+this.price);
    }
}

public class constructers1
{
    public static void main(String[] args)
    {
        car c1 = new car("Kia", "Black", 500000);

        c1.carinfo();
    }
}
