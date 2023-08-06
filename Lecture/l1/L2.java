package org.example.gB.lecture.l1;

public class L2 {
    public static void main(String[] args) {

        a();

    }
    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[100]);
    }
}
