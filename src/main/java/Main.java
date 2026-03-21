public class Main {
    public static void main(String args[]){
        int a =10;
        int b =20;
        String statemen1 = "A is better than B";
        String statemen2 = "B is better than A";

        /*
            if (<condition to check> && <cond2> || <cond3>) {
                <do this part if true>
            }else{
                <do this part if false>
            }
        */

        // 10 > 20 -> not true
        if (a>b){
            System.out.println(statemen1);
        }else{
            System.out.println(statemen2);
        }

        // ternary operator
        // (condition) ? <if true exec this statement> : <if false exec this statement>

        System.out.println((a>b)? "A is Greater!" : "B is Greater!" );

        // switch case

        String condition_value = "Gibrish";

        switch (condition_value) {
            case "Add":
                System.out.println("Addition of a and b. A+B=" + String.valueOf(a+b));
                break;
            case "Sub":                
                System.out.println("Addition of b from a. A-B=" + String.valueOf(a-b));
                break;
            default:
                System.out.println("Do no operation A="+String.valueOf(a)+" B="+String.valueOf(b));
                break;
        }
    }
}
