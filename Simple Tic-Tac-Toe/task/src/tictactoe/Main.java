package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells:");
        String i = scanner.nextLine();

        String[] board = new String[2];
        board[0] = "---------";
        board[1] = "|";

        System.out.println(board[0]);
        System.out.println(board[1] + " " + i.charAt(0) + " " + i.charAt(1) + " " + i.charAt(2) + " " + board[1]);
        System.out.println(board[1] + " " + i.charAt(3) + " " + i.charAt(4) + " " + i.charAt(5) + " " + board[1]);
        System.out.println(board[1] + " " + i.charAt(6) + " " + i.charAt(7) + " " + i.charAt(8) + " " + board[1]);
        System.out.println(board[0]);
    }
}