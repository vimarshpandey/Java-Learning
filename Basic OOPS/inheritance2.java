class person
{
    String name;
    int age;

    person(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
}

class asian extends person
{
    double height;

    asian(String n, int a, double h)
    {
        super(n, a);
        this.height = h;
    }
}

public class inheritance2
{
    public static void main(String[] args)
    {
        asian a1 = new asian("Anna", 18, 157.55);

        System.out.println(a1.name + "\n" + a1.age + "\n" + a1.height);
    }
}
