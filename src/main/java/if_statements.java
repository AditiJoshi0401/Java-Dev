public class if_statements {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        String statemen1 = "A is better than B";
        String statemen2 = "B is better than A";

        /*
         * if (<condition to check> && <cond2> || <cond3>) {
         * <do this part if true>
         * }else{
         * <do this part if false>
         * }
         */

        // 10 > 20 -> not true
        if (a > b) {
            System.out.println(statemen1);
        } else {
            System.out.println(statemen2);
        }
    }
}
