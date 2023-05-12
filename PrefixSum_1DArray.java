import java.util.*;
public class PrefixSum_1DArray {

    public static void prefixSum(int arr[]){
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = s.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements : ");

        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        prefixSum(arr);
    }
    
}
