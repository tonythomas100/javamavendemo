package io.github.tonythomas100;

public class App {

    public static void main(String[] args) {

        /*if (args.length != 2) {
            System.out.println("Usage: java App <num1> <num2>");
            return;
        }*/

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        int result = add(a, b, c);
        System.out.println("Print Result = " + result);
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}