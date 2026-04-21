package string_problems;

import java.util.HashSet;

public class remove_duplicate {
    public static void main(String[] args) {
        String value = "aabbcc";
        HashSet<Character> seen = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (char ch : value.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}