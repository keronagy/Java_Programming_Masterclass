package Section4;

/*
    Equality Printer
Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different".



EXAMPLES OF INPUT/OUTPUT:

printEqual(1, 1, 1); should print text All numbers are equal

printEqual(1, 1, 2); should print text Neither all are equal or different

printEqual(-1, -1, -1); should print text Invalid Value

printEqual(1, 2, 3); should print text All numbers are different



TIP: Be extremely careful about spaces in the printed message.



NOTES

The solution will not be accepted if there are extra spaces.

The method printEqual needs to be defined as public static ​like we have been doing so far in the course.

Do not add main method to solution code.

  

 */

public class IntEqualityPrinter {
    public static final String INVALID_VALUE = "Invalid Value";
    public static final String ALL_EQUAL = "All numbers are equal";
    public static final String ALL_DIF = "All numbers are different";
    public static final String NO_EQU_DIFF = "Neither all are equal or different";



    public static void printEqual(int x , int y , int z)
    {
        if(x <0 || y<0 || z<0) System.out.println(INVALID_VALUE);
        else if (x==y && x==z) System.out.println(ALL_EQUAL);
        else if (x!= y && x!= z && y!=z) System.out.println(ALL_DIF);
        else System.out.println(NO_EQU_DIFF);
    }

}
