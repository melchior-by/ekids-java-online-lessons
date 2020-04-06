package by.epam.ekids;

import by.epam.ekids.kitchen.Cook;
import by.epam.ekids.recepies.Recipe;
import by.epam.ekids.recepies.RecipeService;

import java.time.Duration;

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

    /*
    *  STACK
    *  ******
    *  *  1  *
    *  *  2  *
    *  *  3  *
    *  *  4  * --
    *  *  5  *  |
    *  ******   |
    *           |
    *   HEAP    |
     *  ***************
     *  *  1   52.1    * Double a = 52.1;
     *  *              *
     *  *   hi   ""    *
     *  *     100500   *
     *  ***************
    * */

    private static String user = "Степан";
    private static int count = 10;

    public static void main(String[] args) throws InterruptedException {

        printMe("Hello world!", 1);

        printMe(String.format("Привет %s, мы тебя поприветствуем %d раз", user, count), count);

        // создаем объект рецепта пельменей
        Recipe pelmeni = new Recipe("ПЕЛЬМЕНИ", new String[]{"мясо", "тесто", "сметанкой"},
                "Сходить в магазин, купить %s, %s. Слепить пельмени. \nСварить. Полить %s.");
        Recipe pizza = new Recipe("ПИЦЦУНЯ", new String[]{"тесто", "сыр", "грибочки"},
                "Взять ингридиенты, замесить %s, добавить %s и %s. Отправить в печь при 120 °C");

        RecipeService.printRecipe(pelmeni);
        RecipeService.printRecipe(pizza);

        // с помощью set методов задаем его поля (ингридиенты и инструкцию по приготовлению)
        pelmeni.setIngredients(new String[]{"мясо", "тесто", "маянезик"});
        pelmeni.setInstructions("Надеть маску от короны. Сходить в магазин, купить %s, %s. Слепить пельмени. \nСварить. Полить %s.");

        RecipeService.printRecipe(pelmeni);

        //здесь мы уже можем готовить блюда - создаем повара и рецепт у которого есть время приготовления
        Cook stevenSeagal  = new Cook("Steven Seagal", 100);
        Recipe shavuha = new Recipe("ШАВУХА", new String[]{"мясо", "лаваш", "овощи"},
                "Срезать %s с вертела, положить в %s. Добавить %s и завернуть.", Duration.parse("PT15M"));
        RecipeService.printCookingProcess(shavuha, stevenSeagal);
    }

    private static void printMe(String message, int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(message);
        }
    }
}
