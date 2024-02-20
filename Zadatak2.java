import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Unesite string: ");
        String ulazniString = scanner.nextLine();
        
        int brojKaraktera = ulazniString.length();
        
        System.out.println("Broj karaktera u unesenom stringu je: " + brojKaraktera);
        
        scanner.close();
    }
}