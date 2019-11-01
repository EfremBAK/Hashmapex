import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise {

    public static void main(String[] args) {

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        System.out.println("Please enter a number from: 10, 8, or 6 ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        myMap.put(10, "ten");
        myMap.put(8, "eight");
        myMap.put(6, "six");
         if(myMap.containsKey(x))
             System.out.println("the number you  put in exist in my list and it is read as " + myMap.get(x));



    }
}

