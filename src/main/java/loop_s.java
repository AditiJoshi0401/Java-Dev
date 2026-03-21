public class loop_s {
  public static void main(String[] args) {
    int a = 10;
    while (a > 0) {
      System.out.println(a);
      a = a - 1;
    }

    for (int index = 5; index != 0 && a > 0; index--) {
      System.out.println("Value of a : " + String.valueOf(a));
      a = a - 1;
    }

    System.out.println("Last / Final Value of a is " + String.valueOf(a));
  }
}

public class loop_exit {
  public static void main(String args[]) {
    int conditionValue = 11;
    int index = 20;
    while (index > 0) {
      conditionValue--;
      // index % conditioValue = remainder
      // remainder is zero --> condition_value divides index

      if (index % conditionValue == 0) {
        System.out.println("YAY!! we got a hit!! \n condition_value = " + String.valueOf(conditionValue) +
            " index value = " + String.valueOf(index));
        break; // switch case
      }
      index--;
    }

    // for(index=10 ;index>0;index--){

    // }
  }
}

// #include <>
import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    // way to get input from user
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    System.out.println("Input is " + String.valueOf(a));

    sc.close();
  }

}
