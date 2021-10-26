package com.company;
import java.util.Random;
import java.util.Scanner;

public class Rock {


    public static void main(String[] args) {
        System.out.println("\t\t*...ROCK-PAPER-SCISSOR...*");
        System.out.println("\t\t\t lets start.....");
        System.out.println("\t\tchoose between 1-3");
        System.out.println("\t\t 1)--->Rock 2)--->Paper 3)--->Scissor");
        int a = 0;
        int x = 0;
        int y = 0;

        while(a < 5) {
            ++a;
            Scanner Scan = new Scanner(System.in);
            Random rnd = new Random();
            int comp = rnd.nextInt(3) + 1;
            System.out.println("Enter your play...");
            int play = Scan.nextInt();
            if (play>3){
                System.out.println("invalid input");
                break;
            }
            else if (comp == play) {
                System.out.println("its a draw");
            } else if (comp == 1 && play == 2) {
                System.out.println("System's choice-"+"Rock");
                System.out.println("Your choice-"+"Paper");
                ++x;
            } else if (comp == 1 && play == 3) {
                System.out.println("System's choice-"+"Rock");
                System.out.println("Your choice-"+"Scissor");
                ++y;
            } else if (comp == 2 && play == 1) {
                System.out.println("System's choice-"+"Paper");
                System.out.println("Your choice-"+"Rock");
                ++y;
            } else if (comp == 2 && play == 3) {
                System.out.println("System's choice-"+"Paper");
                System.out.println("Your choice-"+"Scissor");
                ++x;
            } else if (comp == 3 && play == 1) {
                System.out.println("System's choice-"+"Scissor");
                System.out.println("Your choice-"+"Rock");
                ++x;
            } else if (comp == 3 && play == 2) {
                System.out.println("System's choice-"+"Scissor");
                System.out.println("Your choice-"+"Paper");
                ++y;
            } else {
                System.out.println("\tinvalid input");
            }

            System.out.println("\tyour input-- " + play);
            System.out.println("\tcomputer's play is\t" + comp);
        }

        System.out.println("\t\tGame score--->");
        System.out.println("\t\tyour score= " + x);
        System.out.println("\t\tsystem's score= " + y);
        if (x > y) {
            System.out.println("\t\tyou won the game ");
        } else if (y > x) {
            System.out.println("\t\tyou lost the game...");
        } else {
            System.out.println("\t\t\t\tDRAW");
        }

    }
}
