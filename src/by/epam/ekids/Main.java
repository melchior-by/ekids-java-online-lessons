package by.epam.ekids;

import by.epam.ekids.recepies.RecipePrinter;

public class Main {

    //БЛОКИ КОДА
    //    int i = 0;
    //    {}

    /*
        Заказчик хочет чтобы программа выполняла 2 различные функции:
        1. Приветствовала работника - для этого функционал выносим в отдельный метод и называем его printMe()
        2. Выводила рецепт его бабушки - очевидно что это уже более сложная задача, тут нам понадобится уэе
            отдельные классы. Саму задачу можно разбить на 2 подзадачи - хранить рецепты и печатать рецепты.
            Для хранения рецептов мы создаем Data класс - Recipe, для вывода - RecipePrinter и кладем их в 1 пакет,
            таким образом в последующем нам или другому программисту станет понятно, что их функционал связан.
    */

    // !!! ЕСЛИ МЫ МОЖЕМ ВЫДЕЛИТЬ ФУНКЦИОНАЛ - ИСПОЛЬЗУЕМ ИЛИ ОТДЕЛЬНЫЙ МЕТОД ИЛИ СОЗДАЕМ КЛАСС.

    private static String user = "Степан";
    private static int count = 10;

    public static void main(String[] args) {
        printMe("Hello world!", 4);

        printMe(String.format("Привет %s, мы тебя поприветствуем %d раз", user, count), count);

        RecipePrinter.print();
    }

    private static void printMe(String message, int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(message);
        }
    }
}
