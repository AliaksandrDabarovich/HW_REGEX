package com.epam.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //1
        find("a[hce]b", "ahb acb aeb aeeb adcb axeb");

        //2
        find("a..a", "aba aca aea abba adca abea");

        //3
        find("ab[be]a", "aba aca aea abba adca abea");

        //4
        find("ab[be]a", "aba aca aea abba adca abea");

        //5
        find("aba+", "aba aca aea abba adca abea");

        //6
        find("ab*a", "aa aba abba abbba abca abea");

        //7
        find("ab?a", "aa aba abba abbba abca abea");

        //8
        find("ab+a", "aa aba abba abbba abca abea");

        //9
        find("(ab)+", "ab abab abab abababab abea");

        //10
        find("a\\.a", "'a.a aba aea");

        //11
        find("2\\+3", "2+3 223 2223");

        //12
        find("2\\++3", "23 2+3 2++3 2+++3 345 567");

        //13
        find("2\\+*3", "23 2+3 2++3 2+++3 445 677");

        //14
        find("\\*q+\\+", "*+ *q+ *qq+ *qqq+ *qqq qqq+");

    }
    private static void find(String pattern, String text) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.println(m.group());
        }
        System.out.println();
    }

}

