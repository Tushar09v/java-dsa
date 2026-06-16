
import java.util.Arrays;


public class ReplaceElement{
    public static int[] replaceElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int rightMax = -1;

        for(int i = n -1; i >= 0; i--){
            ans[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }
        return ans;
    }

public static void main(String[] args){
    int[] arr = {17,18,5,4,6,1};
    System.out.println(Arrays.toString(replaceElement(arr)));
}
}