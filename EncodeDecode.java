import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    // a list of string to a string
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append('/').append(str);
        }
        return sb.toString();
    }

    // a string to a list of string
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int slash = s.indexOf('/', i);
            int size = Integer.parseInt(s.substring(i, slash));
            result.add(s.substring(slash + 1, slash + size + 1));
            i = slash + size + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("World");
        EncodeDecode obj = new EncodeDecode();
        String encoded = obj.encode(strs);
        System.out.println(encoded);
        List<String> decoded = obj.decode(encoded);
        System.out.println(decoded);
    }
}
