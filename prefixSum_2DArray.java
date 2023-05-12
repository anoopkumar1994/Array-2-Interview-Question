import java.util.Scanner;

public class prefixSum_2DArray {

    public static void prifixSum(int arr[][]){
        //Travers row wise
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        //Travers column wise
        for(int j = 0; j<arr.length; j++){
            for(int i = 1; i<arr.length; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    // total sum
    public static int totalSum(int arr[][], int r1, int c1, int r2, int c2){
        int sum = 0, up = 0, left = 0, repated = 0, result = 0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repated = arr[r1-1][c1-1];

        result = sum - up - left + repated;
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter row size : ");
        int r = s.nextInt();
        System.out.print("Enter column size : ");
        int c = s.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter total " + r * c + " elements ");
        for(int i = 0; i<r; i++){
            for(int j = 0; j <c; j++){
                arr[i][j] = s.nextInt();
            }
        }

        System.out.print("Enter r1 :");
        int r1 = s.nextInt();
        System.out.print("Enter c1 :");
        int c1 = s.nextInt();
        System.out.print("Enter r2 :");
        int r2 = s.nextInt();
        System.out.print("Enter c2 :");
        int c2 = s.nextInt();

        prifixSum(arr);
        int result = totalSum(arr, r1, c1, r2, c2);
        System.out.println(result);
    }
    
}
