package test02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ingresa tu nombre : ");
        String name = scanner.nextLine();
        System.out.println("Hola "+name);
        scanner.close();
    }
}
