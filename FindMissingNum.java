import java.util.Arrays;
public class FindMissingNum {
    public static void main(String[] args) {

        int arr[] = {4,5,1,2,6};
        Arrays.sort(arr);
        int n = arr.length;

        int sum_natural_num = ((n+1)*(n+2))/2;
        int sum = 0;
        int missing_num = 0;

        for(int i = 0; i<n; i++){
            sum += arr[i];
            missing_num=  sum_natural_num -sum;
        }
        System.out.println(missing_num);

    }
}
