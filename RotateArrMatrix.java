import java.util.Arrays;
import java.util.Scanner;


public class RotateArrMatrix {
    public static void rotateArr(int arr[][]){
        // 1st Step: Transpose the array
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // 2nd Step: Swap the array
        for(int i = 0; i < arr.length; i++){
            int left = 0;
            int right = arr.length - 1;
            
            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }

        
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Row size : ");
        int row = s.nextInt();
        System.out.print("Enter the Column size : ");
        int colums = s.nextInt();
        int arr1[][] = new int[row][colums];
        System.out.println("Enter your total rows & colums elements : " + row * colums);

        for(int i = 0; i<row; i++){
            for(int j = 0; j <row; j++){
                arr1[i][j] = s.nextInt();
            }
        }

       rotateArr(arr1);

       // Print array
       for(int result[] : arr1){
         System.out.println(Arrays.toString(result));
       }

    }
    
}
