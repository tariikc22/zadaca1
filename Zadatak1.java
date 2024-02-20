import java.util.Scanner;
public class Zadatak1 {
    
    
    public static int sumaCifara(int broj) {
        int suma = 0;
        while (broj != 0) {
            suma += broj % 10; 
            broj /= 10; 
        }
        return suma;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Unesite broj n: ");
        int n = scanner.nextInt();
        
        System.out.println("Brojevi između 1 i " + n + " koji su djeljivi sa sumom svojih cifara su:");
        
        for (int i = 1; i <= n; i++) {
            int suma = sumaCifara(i); 
            if (i % suma == 0) {
                System.out.println(i); 
            }
        }
        
        scanner.close();
    }
}