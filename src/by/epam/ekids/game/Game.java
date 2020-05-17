package by.epam.ekids.game;

public class Game {

    private String[] board = new String[]{"_", "_", "_", "_", "_", "_", "_", "_", "_"};

    public String[] getBoard() {
        return board;
    }

    public void goO(int position){
        board[position] = "O";
        Display.showBoard(board);
    }

    public void goX(int position){
        board[position] = "X";
        Display.showBoard(board);
    }

    /*
    * 1. Меню игры
    * 2. Приглашение к игре
    * 3. Проверки хода
    * 4. Проверки победы
    * 5. Сообщение о результате партии
    * ***6. Результат нескольких матчей
    * ****7. Улучшенное поле
    *
    * */
}
