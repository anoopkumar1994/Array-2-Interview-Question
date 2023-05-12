import java.util.*;
public class PreSum_bruteForce {

    public static int prifixSum(int arr[][], int r1, int c1, int r2, int c2){

        int sum = 0;
        for(int i = r1; i <=r2; i++){
            for(int j = c1; j<=c2; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row size : ");
        int r = s.nextInt();
        System.out.print("Enter column size : ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];

       System.out.println("Enter your array elements ");
       for(int i = 0; i<r; i++){
         for(int j =0; j<c; j++){
           arr[i][j] = s.nextInt();
         }
       }
       
       System.out.print("Enter row 1 ");
       int r1 = s.nextInt();

       System.out.print("Enter column 1 ");
       int c1 = s.nextInt();

       System.out.print("enter row 2 ");
       int r2 = s.nextInt();

       System.out.print("enter column 2 ");
       int c2 = s.nextInt();

      int result = prifixSum(arr, r1, c1, r2, c2);
       System.out.println(result);
    }
}
