import java.util.Random;
import java.util.Scanner;
import java.lang.*;
public class Newone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;int max = 100;
        Random random = new Random();
        
        System.out.println("Random value of type integer between " + min + " to " + max + ":");
        int gen_num = random.nextInt(max - min + 1) + min;
        int score = 0;
        System.out.println("You have 3 rounds");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nYou are in round " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("You are in attempt " + j);
                System.out.print("Enter a number between 1 and 100: ");
                int guess_num = sc.nextInt();
                if (guess_num == gen_num) {
                    System.out.println("Your guess " + guess_num + " is correct\n");
                    score = 15 - (j * i);
                    break;
                } else if (guess_num > gen_num) {
                    System.out.println("Your guess " + guess_num + " is larger than the generated number\n");
                } else {
                    System.out.println("Your guess " + guess_num + " is smaller than the generated number\n");
                }
            }
            if (score != 0) {break;
            }
        }
        System.out.println("Your total score is = " + score);
    }
}