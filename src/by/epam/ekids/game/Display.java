package by.epam.ekids.game;

public class Display {
    public static void showIntro() {
        System.out.println("Добро пожаловать в игру крестики vs нолики");
    }

    public static void showBoard(String[] board) {
        System.out.println();
        System.out.print(board[0] + "|");
        System.out.print(board[1]+ "|");
        System.out.print(board[2]);
        System.out.println();
        System.out.print(board[3] + "|");
        System.out.print(board[4]+ "|");
        System.out.print(board[5]);
        System.out.println();
        System.out.print(board[6] + "|");
        System.out.print(board[7]+ "|");
        System.out.print(board[8]);
        System.out.println();
    }
}
