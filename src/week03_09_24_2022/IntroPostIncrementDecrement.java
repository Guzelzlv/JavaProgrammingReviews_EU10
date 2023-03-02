package week03_09_24_2022;

public class IntroPostIncrementDecrement {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a);
        System.out.println("a = " + a); //variable name and value at the same time

        System.out.println("=======increment start=====");
        System.out.println( a++); //my action is print first do your action
        System.out.println("=======increment end=====");
        System.out.println(a); //a wil be 6
        System.out.println("=======decrement start=====");
        System.out.println(a--); //a 6
        System.out.println(a);
        System.out.println("=======increment end=====");

        int b = 10;
        System.out.println(b--);//first do action (print)we will print 10 and
        // the second change value 9
        System.out.println(b--); // it will print 9 and decrement and it will
        // be 8 for next statement
        System.out.println(b);

        b = b-1; // b-- // b-=1

    }
}
/*
Task 1 : Create a class which is "IntroPostIncrementDecrement" define a variable,

          int a=5;
          print a;
          print the a++;
          print the a--;
 */