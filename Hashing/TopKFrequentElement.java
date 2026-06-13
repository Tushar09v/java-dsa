
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k){
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        int ans[] = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey(); 
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1,2,3,4};
        int k = 3;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
