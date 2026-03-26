public class playwithStrings {

    // to write a function that counts the number of vowels in a string and score it
    // basd on the number of vowels.
    // tool 1 : method
    static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        // tool 2 loops
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            // tool 3 : decison making tool
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // String val = "Abcdefghij";
        // val.length();
        // val.charAt(0);
        // System.out.println("Length of string is "+ String.valueOf(val.length()));
        // System.out.println("First character of string is "+ val.charAt(0));
        // System.out.println("Last character of string is "+
        // val.charAt(val.length()-1));
        // System.out.println("Uppercase of string is "+ val.toUpperCase());

        String[] names = { "Alice Hilton", "Bob bardword", "Charlie Chaplin", "Diana Prince", "Eve Adams" };
        for (int i = 0; i < names.length; i++) {
            System.out.println("Number of vowels in " + names[i] + " is " + String.valueOf(countVowels(names[i])));
        }

    }
}