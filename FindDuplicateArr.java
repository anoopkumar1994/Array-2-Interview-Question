import java.util.Scanner;

public class FindDuplicateArr{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter Array Elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Elements Fount is " + "Index : " + i  + " Element : " + arr[i] + " ");
                }
            }
        }
    }
}
