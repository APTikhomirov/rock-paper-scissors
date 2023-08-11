package dev;

import java.util.Random;
import java.util.Scanner;

public class sol {
    public static void main(String[] args) {
        System.out.println("""
                Let's play the game "Rock Paper Scissors".
                Your opponent will be a computer.
                To select an action, enter the appropriate symbol in the console:
                1 - Rock
                2 - Paper
                3 - Scissors
                """);
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int x;
        do
        {
            while (true) {
                if (!console.hasNextInt()){
                    System.out.println("NE POPAL)))");
                    console.next();
                    continue;
                }
                x = console.nextInt();
                if (x < 1 || x > 3){
                    System.out.println("Vvedi 4islo ot 1 do 3!!!!!!");
                    continue;
                }
                break;
            }
            int r = (random.nextInt(3)+1);
            if (x == 1)
            {
                if (r == 1)
                {
                    System.out.println("""
                            You have chosen - Rock
                            The computer chose - Rock
                            The result is a draw
                            """);
                }
                else if (r == 2)
                {
                    System.out.println("""
                            You have chosen - Rock
                            The computer chose - Paper
                            The result - computer won
                            """);
                }
                else
                {
                    System.out.println("""
                            You have chosen - Rock
                            The computer chose - Scissors
                            The result - you won
                            """);
                }
            }
            if (x == 2)
            {
                if (r == 1)
                {
                    System.out.println("""
                            You have chosen - Paper
                            The computer chose - Rock
                            The result - you won
                            """);
                }
                else if (r == 2)
                {
                    System.out.println("""
                            You have chosen - Paper
                            The computer chose - Paper
                            The result is a draw
                            """);
                }
                else
                {
                    System.out.println("""
                            You have chosen - Paper
                            The computer chose - Scissors
                            The result - computer won
                            """);
                }
            }
            if (x == 3)
            {
                if (r == 1)
                {
                    System.out.println("""
                            You have chosen - Scissors
                            The computer chose - Rock
                            The result - computer won
                            """);
                }
                else if (r == 2)
                {
                    System.out.println("""
                            You have chosen - Scissors
                            The computer chose - Paper
                            The result - you won
                            """);
                }
                else
                {
                    System.out.println("""
                            You have chosen - Scissors
                            The computer chose - Scissors
                            The result is a draw
                            """);
                }
            }
            System.out.println("""
            To play again, enter - go
            To complete the game, write - exit
            """);
            String s;
            while (true){
                Scanner str = new Scanner(System.in);
                String a = str.nextLine();
                if (a.equalsIgnoreCase("go")) {
                    s = a;
                    break;
                }
                else if (a.equalsIgnoreCase("exit")) {
                    s = a;
                    break;
                }
                else
                    System.out.println("POPADI PO KNOPKAM");
            }
            if (s.equalsIgnoreCase("go"))
                System.out.println("""
                                   choose:
                                   1 - Rock
                                   2 - Paper
                                   3 - Scissors
                                   """);
            else
                break;
        }
        while (true);
        System.out.println("thanks for game, see you later!");
    }
}