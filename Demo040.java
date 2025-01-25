import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch=scanner.next().charAt(0);
        if (Character.isUpperCase(ch)){
            System.out.println("The character '"+ ch +"' is uppercase: ");
        } else if (Character.isLowerCase(ch)){
            System.out.println("The character '"+ ch +"' is lowercase: ");
        } else if(Character.isDigit(ch)){
            System.out.println("The character '"+ ch +"' is a digit: ");
        } else {
            System.out.println("The character '" + ch + "' is a special character.");
        }
    }
}