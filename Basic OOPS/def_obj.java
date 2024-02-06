class student
{
    String name = "Vimarsh";
    int age = 22;
    double height = 170.5;

    void hello()
    {
        System.out.println("Hello "+name);
    }

    void cando()
    {
        System.out.println("I can do these things because my height is "+height);
    }
}

public class def_obj
{
    public static void main(String[] args)
    {
        student s1 = new student();

        System.out.println("My name is: "+s1.name);
        System.out.println("My age is: "+s1.age);

        s1.hello();
        s1.cando();
    }
}