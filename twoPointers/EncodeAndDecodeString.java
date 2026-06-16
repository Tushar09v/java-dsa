
import java.util.ArrayList;
import java.util.List;


class EncodeAndDecodeString {
    //Encoding
    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length() + "#" + str);
            
        }
        return  sb.toString();
    

        
    }
    //Decoding
    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        int i = 0;
        while(i< str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
        String len = str.substring(i,j);
        int length = Integer.parseInt(len);
        int start  = j + 1;
        int end = start + length;
        res.add(str.substring(start, end));
        i = end;
        }
        return res;
    }

    public static void main(String[] args) {
        EncodeAndDecodeString codec = new EncodeAndDecodeString();
        List<String> input = List.of("hello", "world");
        System.out.println(codec.decode(codec.encode(input)));
    }
}
