import java.util.*;

public class multi_dim_array_list
{
    public static void main(String[] args)
    {
        ArrayList<String> friends = new ArrayList<String>();

        friends.add("Yogesh");
        friends.add("Anand");
        friends.add("Nishant");
        friends.add("Kiran");

        ArrayList<String> salary = new ArrayList<String>();

        salary.add("20000");
        salary.add("30000");
        salary.add("15000");
        salary.add("10000");

        ArrayList<ArrayList<String>> allData = new ArrayList<ArrayList<String>>();

        allData.add(friends);
        allData.add(salary);

        System.out.println(allData);

        for(int i = 0; i < friends.size(); i++)
        {
            for(int j = 0; j < salary.size(); j++)
            {
                System.out.println(allData.get(i).get(j));
            }
        }
    }
}
