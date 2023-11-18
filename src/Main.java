import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = CheckN(s);
        int[] array = new int[n];

        InputData(array,s);
        SortData(array);
        DisplayData(array);

    }
    public static void InputData(int[] arr, Scanner s){
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
    }
    public static void DisplayData(int[] arr){
        for (int data : arr){
            System.out.print(data + " ");
        }
    }
    public static void SortData(int[] arr){
        Arrays.sort(arr);
    }

    public static int CheckN(Scanner s){
        int c = s.nextInt();
        while(c < 0){
            System.out.println("Value must be greater than or equal to 0");
            c = s.nextInt();
        }
        return c;
    }

}