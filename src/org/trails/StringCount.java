package org.trails;

import java.util.Date;

public class StringCount {
    public static void main(String[]args) {
        String s = "Mechanical Engineering";
        Date date = new Date();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) < i) continue;
            int count = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j) == ch) count++;            
            }
            System.out.println("count of " + ch + " is : " + count);   
        }
        Date date1 = new Date();
        System.out.println(date1 + " "+ date);
    }
}
