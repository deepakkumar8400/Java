import java.util.*;

class Substring {
    public static void main(String[] args) {
        String a = "abcd";
        ArrayList<String> al = new ArrayList<>();
        find(a, al, new StringBuilder(), 0);
        System.out.println(al);
    }

    static void find(String s, ArrayList<String> al, StringBuilder sb, int i) {
        if (i == s.length()) {
            al.add(sb.toString());
            return;
        }

        sb.append(s.charAt(i));
        find(s, al, sb, i + 1);  // include character
        sb.deleteCharAt(sb.length() - 1);
        find(s, al, sb, i + 1);  // exclude character
    }
}
