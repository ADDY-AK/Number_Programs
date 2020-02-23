//count upper case character in the string

import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {
        int s = 0;
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        for (int i = 0; i < Str.length(); i++) {
            char ch = Str.charAt(i);
            if (Character.isUpperCase(ch)) {
                s = s + (int) ch;
            }

        }
        System.out.println(s);

    }
}

