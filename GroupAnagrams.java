import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] freq = new char[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = new String(freq);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    // How we performed this
    // We create a map to store the key and the list of strings that have the same key
    // We iterate through the strings
    // For each string, we create a frequency array of size 26
    // We iterate through the characters of the string and increment the frequency of the character
    // We create a key from the frequency array
    // We get the list of strings that have the same key
    // If the list is null, we create a new list
    // We add the string to the list
    // We put the key and the list in the map
    // We return the list of lists of strings
    // The time complexity is O(n * k) where n is the number of strings and k is the length of the longest string
    // The space complexity is O(n * k) where n is the number of strings and k is the length of the longest string

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(strs));
    }
}
