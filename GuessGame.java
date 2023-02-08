import java.util.Scanner;

class Guesser {
    int guessNum;

    public int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess a number");
        guessNum = sc.nextInt();
        return guessNum;

    }
}

class Player {
    int guessNum;

    public int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly guess a number");
        guessNum = sc.nextInt();
        return guessNum;
    }

}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser guess = new Guesser();
        numFromGuesser = guess.guessingNumber();
    }

    public void collectNumFromPlayers() {
        Player p1 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        Player p2 = new Player();
        numFromPlayer2 = p2.guessingNumber();
        Player p3 = new Player();
        numFromPlayer3 = p3.guessingNumber();
    }

    public void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Sab jeet gaye");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player1 aur Player2 jeet gaye");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player1 aur Player3 jeet gaye");
            } else {
                System.out.println("Player1 won the game");
            }

        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player2 aur Player3 jeet gaye ");
            } else {
                System.out.println("Player2 won the game");
            }

        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player3 won the game");
        } else {
            System.out.println("Koi nhi jeeta");
        }

    }
}

public class GuessGame {

    public static void main(String[] args) {
        System.out.println("Get Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();

    }
}
