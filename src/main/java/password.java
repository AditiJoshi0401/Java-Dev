// Example 1: The "Vault" (Strict Private Security)
// This example shows how private protects data from accidental or malicious changes.
class BankVault {
    private double goldReserve = 5000.0; // Hidden from the world
    private String masterPin = "1234";

    // Public method: The ONLY way to interact with the gold
    public void withdrawGold(String enteredPin, double amount) {
        if (enteredPin.equals(masterPin)) {
            if (amount <= goldReserve) {
                goldReserve -= amount;
                System.out.println("Withdrawal successful! Remaining: " + goldReserve + "kg");
            } else {
                System.out.println("Not enough gold in the vault!");
            }
        } else {
            System.out.println("ACCESS DENIED: Wrong PIN.");
        }
    }
}

public class vault {
    public static void main(String[] args) {
        BankVault myVault = new BankVault();

        // myVault.goldReserve = 0; // ERROR: goldReserve has private access
        myVault.withdrawGold("1234", 100.0); // Success!
        myVault.withdrawGold("9999", 50.0); // Fails!
    }
}