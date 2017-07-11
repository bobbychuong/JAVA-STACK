import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;
public class Puzzling {
  public static void greaterTen(int[] array){
    int temp = 0;

    ArrayList<Integer> myArray = new ArrayList<Integer>();      // myArray = [3,5,1,2,7,9,8,13,25,32]
    for(int i=0;i<array.length;i++){                            // int i = 9; 9 < 10; 9++
      temp = temp + array[i];                                   // temp = 73 + 32; =>arr1[i]
    }
    System.out.println("Sum:" + temp);                          // Sum: 105
    for (int i=0;i<array.length;i++){
      if(array[i] > 10){                                        // array[i] > 10
        myArray.add(array[i]);                                  // myArray.add(3,5,1,2,7,9,8,13,25,32)
      }
    }
    System.out.println("Filtered Array:" + myArray);          // 13,15,32
  }
//Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa.
//Shuffle the array and print the name of each person
//Have the method also return an array with names that are longer than 5 characters.
  public static void printString(String[] array){
    ArrayList<String> myArray = new ArrayList<String>();
    Collections.shuffle(myArray);
    // List<String> hiArray = Arrays.asList(array);
    for(int i=0;i<array.length;i++){                //i=0;i<array.length;i++
      System.out.println("String:" + array[i]);
    }
    for(int i=0;i<array.length;i++){              //i=0;0<5;0++
      if(array[i].length() > 5){                  // array[i].length
        System.out.println("Greater than 5:" + array[i]);
      }
    }
  }
}
