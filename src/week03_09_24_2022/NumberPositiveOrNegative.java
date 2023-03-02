package week03_09_24_2022;

/*Task 4: Create a class which is "NumberPositiveOrNegative"
 and create a variable if the variable is positive print "positive" if not "negative"

 */
public class NumberPositiveOrNegative {

    public static void main(String[] args) {
        //create a variable
        int a=10;
        //compare with 0
        boolean aIsPositive=a>0;
        // if condition is true print Positive
        if (aIsPositive) {
            System.out.println("POSITIVE");
        }
            else {
                //else print negative
            System.out.println("NEGATIVE");
        }

    }
}
