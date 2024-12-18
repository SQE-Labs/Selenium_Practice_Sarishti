
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static <Arraylist> void main(String[] args) {

        int[] arr2 = {1,2,3,4,12,13,64,78,55,62,80,99};
        for (int i = 0; i<arr2.length;i++)
        {
            if (arr2[i] % 2 == 0)
            {
                System.out.println(arr2[i]);
            }
            else {
                System.out.println(arr2[i] + " is not multiple of 2");
            }
        }
        ArrayList<String> a = new ArrayList<String>();
        //creating object of the class. To access: Use object.method
        a.add("Ram");
        a.add("Sham");
        a.add("Sam");
        a.remove("Sham");
        System.out.println(a.get(1)); //To extract value use get

        for(int i =0 ; i<a.size() ; i++)
        {
            System.out.println(a.get(i) + "********");
        }
        for( String val :a)
        {
            System.out.println(val);
        }
        //check item is present in arraylist
        System.out.println(a.contains("Ram"));

        //Convert Array to Array List
        String[] name = {"rahul", "shetty", "selenium"};
        List<String> Convertedlist = Arrays.asList(name);
        System.out.println(Convertedlist.contains("shetty"));
    }
}
