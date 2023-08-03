import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.next();
        System.out.println(stringCompresssion(s1));
    }

    public static String stringCompresssion(String s) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        int count =1;
        for(int j =1; j<s.length(); j++){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }
            if(s.charAt(i) != s.charAt(j) || j==s.length()-1) {
                sb.append(s.charAt(i));
                sb.append((count));
                count =1;
                i=j;
            }
        }
        return sb.toString();
    }
}
