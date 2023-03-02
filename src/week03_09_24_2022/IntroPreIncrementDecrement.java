package week03_09_24_2022;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {

        int a=5;

        System.out.println("a = " + a);;//5

        System.out.println(++a);//a=6

        System.out.println(a++); // in line 12 a=6
        //in 13 line will be a=7

        System.out.println(--a);//5

        int x=10;
        int number=x++ +100; //number, number=110
        System.out.println("number = " + number); // x=11
// int x=11; at backend or memory we have that value in x
        int number2=++x + 100;
        System.out.println("number = " + number2);

    }
}
/*
ask 2:  Create a class which is "IntroPreIncrementDecrement" define a variable,

          int a=5;
          print a;
          print the ++a;
          print the --a;

 */