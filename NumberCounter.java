import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[11]; // индекси от 0 до 10, използваме 1-10
        
        System.out.println("Програма за броене на числа от 1 до 10");
        System.out.println("Въведете число от 1 до 10 (или 0 за изход):");
        
        while (true) {
            System.out.print("Въведете число: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Моля, въведете валидно число!");
                scanner.next(); // изчистваме невалидния вход
                continue;
            }
            
            int number = scanner.nextInt();
            
            if (number == 0) {
                break; // изход от програмата
            }
            
            if (number >= 1 && number <= 10) {
                counts[number]++;
                System.out.println("Числото " + number + " беше въведено.");
            } else {
                System.out.println("Моля, въведете число между 1 и 10!");
            }
        }
        
        // Показваме резултатите
        System.out.println("\n=== Резултати ===");
        boolean hasEntries = false;
        for (int i = 1; i <= 10; i++) {
            if (counts[i] > 0) {
                System.out.println("Числото " + i + " беше въведено " + counts[i] + " път(и)");
                hasEntries = true;
            }
        }
        
        if (!hasEntries) {
            System.out.println("Не са въведени числа.");
        }
        
        scanner.close();
    }
}
