import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        // int[] rno = new int[5];


        // input using forloop;

        // for(int i=0; i < rno.length; i++){
        //     rno[i] = in.nextInt();
        // }

        // for(int num : rno){
        //     System.out.print(num + " ");
        // }

        // System.out.print(Arrays.toString(rno)); 

        // String[] str  = new String[4];

        // for(int i = 0; i < str.length; i++){
        //     str[i] = in.next();
        // }

        // System.out.println(Arrays.toString(str));


        // arrays in functions

        int[] num = {12,23,34,45,56};

        System.out.println(Arrays.toString(num));

        change(num);

        System.out.println(Arrays.toString(num));



    }

    static void change(int [] arr){
        arr[0] = 99;
    }
}