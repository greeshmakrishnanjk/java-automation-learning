import java.util.*;
 
  public class add {
 
     public static void main(String[] args)
    {
        int n = 10;
        int i;
 
        Integer intArray[]
            = { 1, 2, 3, 4, 5 };
 
        System.out.println("Original Array:\n" + Arrays.toString(intArray));
 
        int num = 10;
 
        List<Integer>intlist = new ArrayList<Integer>(Arrays.asList(intArray));
 
        intlist.add(num);
 
        intArray = intlist.toArray(intArray);
 
        System.out.println("\nArray after adding " + num + "\n" + Arrays.toString(intArray));
    }
}