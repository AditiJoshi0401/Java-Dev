public class arrays_check {
    // tool 2 : method
    static void print(int marks, String name) {
        System.out.println(name + "\t--\t" + String.valueOf(marks) + "/10");
    }

    public static void main(String args[]) {
        int[] marks = { 10, 9, 5, 7, 10 };
        String[] names = { "ajay", "Vijay", "ram", "rekha", "sita" };
        System.out.println("name\t--\tmarks");

        // tool 1 : the loop
        for (int i = 0; i < 5; i++) {
            print(marks[i], names[i]);
        }
    }
}