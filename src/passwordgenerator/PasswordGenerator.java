package passwordgenerator;

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    static void password(int length)
    {
        String word = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*|?<>~/";
        char passChar[] = word.toCharArray();
        char result[] = new char[length];
        Random random = new Random();
        System.out.print("Random generated Password is: ");
        for(int i=0; i<length; i++)
        {
            result[i] = passChar[random.nextInt(word.length())];
            System.out.print(result[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
       
        System.out.println("RANDOM PASSWORD GENERATOR PROGRAM-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length for password : ");
        int passLength = sc.nextInt();
        password(passLength);
    }
    
}
