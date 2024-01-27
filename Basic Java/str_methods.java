public class str_methods
{
    public static void main(String[] args)
    {
        String name = "Vimarsh";

        boolean result1 = name.equals("Vimarsh");
        boolean result2 = name.equals("vimarsh");
        boolean result3 = name.equalsIgnoreCase("vimarsh");
        int result4 = name.length();
        char result5 = name.charAt(4);
        int result6 = name.indexOf("h");
        boolean result7 = name.isEmpty();
        String result8 = name.toUpperCase();
        String result9 = name.toLowerCase();
        String result10 = name.trim();
        String result11 = name.replace("arsh", "u");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);
        System.out.println(result11);
    }
}
