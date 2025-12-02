package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss arr= new Arrayss();
        int []numbers={1,9,3,4,5,6,7,8};
        Arrays.sort(numbers);
        arr.Traversal(numbers);
        //int result=arr.LinearSearch(numbers,7);
        int result=arr.BinarySearch(numbers,7,0,numbers.length-1);

        if(result!=-1)
        System.out.println("value found at index:"+result);
        else
        System.out.println("value not found ");



        // arr.update(numbers,9,4);
        //arr.delete(numbers,3);
       // arr.shiftLeft_delete(numbers,2);
       // arr.Traversal(numbers);



        ///int []numbers=new int[5];
      //  arr.input(numbers);
        // arr.ReverseTraversal(numbers);


        //System.out.println(Arrays.toString(numbers));


    }
}
