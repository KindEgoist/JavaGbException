package org.example.Seminar.s03;

public class Main {
    public static void main(String[] args) {
        String a = "a";
        String b = a;
        String c = "a";
        String d = new String("a");
        String e = new String(a);
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == e);
    }
}
