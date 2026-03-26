import java.util.Scanner;

public class checkPrime {

    // to simplify the print of data
    static void printStatement(String statement){
        System.out.println("print_statment value : " + statement);
    }

    // to check prime
    static String isNumberPrime(int value){        
        if (value ==1)
            return "composite";

        if (value ==2)
            return "prime";

        for(int i=2;i<value;i++){
            if(value%i==0)
                return "Composite";
        }
        return "prime";
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);        
        // if you want to execute any particluar logic atleast once then we do-while
        String input;
        do{
            printStatement("Enter a number to check or exit to exit");
            // take the input
            input = sc.next();
            // whether to use the app or not.
            if (input == "exit")
                    break;
            // function usage chck for prime and print the result.
            printStatement(isNumberPrime(Integer.valueOf(input)));            
        }while(true);

        // close the scanner.
        sc.close();
    }
    /*Exception in thread "main" java.lang.NumberFormatException: For input string: "exit"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.valueOf(Integer.java:999)
        at checkPrime.main(checkPrime.java:38) */
}