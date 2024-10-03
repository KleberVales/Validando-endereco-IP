package validando;

import java.io.*;
import java.util.*;

public class Solution {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {

    String pattern = "^(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]))$";
}
