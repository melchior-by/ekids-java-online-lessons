package by.epam.ekids;

import by.epam.ekids.kitchen.Cook;
import by.epam.ekids.kitchen.FamousCook;
import by.epam.ekids.kitchen.McDonaldsCook;
import by.epam.ekids.recepies.CookingRecipe;
import by.epam.ekids.recepies.RecipeRecord;
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


    /*
    *  Наследование:
    *  1. наследование от 1 класса (в Java)
    *  Домашние котеечки (мешать, повелевать Интернетом) <- Кошачьи (мурчать, иметь крутой хвост, видят в темноте) <- Животное(едят, какают, спят)
    *  Тигры (убить) <- Кошачьи (мурчать, иметь крутой хвост, видят в темноте) <- Животное(едят, какают, спят)
    *
    *  2. наследование от нескольких классов (нет в Java, C++)
    *                       <- Кошачьи (мурчать, иметь крутой хвост, видят в темноте) <- Животное(едят, какают, спят)
    *  Котопес (быть милым)
    *                       <- Собачьи (умение выть, видят в темноте)
    *
    *  ***Чтобы не столкнуться с проблемами множественного наследования в Java выбрали 1 тип реализации наследования и добавили Интерфейсы***
    *
    * */

    private static String user = "Степан";
    private static int count = 10;

    public static void main(String[] args) throws InterruptedException {

        printMe("Hello world!", 1);

        printMe(String.format("Привет %s, мы тебя поприветствуем %d раз", user, count), count);

        // создаем объект рецепта пельменей
        RecipeRecord pelmeni = new RecipeRecord("ПЕЛЬМЕНИ", new String[]{"мясо", "тесто", "сметанкой"},
                "Сходить в магазин, купить %s, %s. Слепить пельмени. \nСварить. Полить %s.");
        RecipeRecord pizza = new RecipeRecord("ПИЦЦУНЯ", new String[]{"тесто", "сыр", "грибочки"},
                "Взять ингридиенты, замесить %s, добавить %s и %s. Отправить в печь при 120 °C");

        RecipeService.printRecipe(pelmeni);
        RecipeService.printRecipe(pizza);

        // с помощью set методов задаем его поля (ингридиенты и инструкцию по приготовлению)
        pelmeni.setIngredients(new String[]{"мясо", "тесто", "маянезик"});
        pelmeni.setInstructions("Надеть маску от короны. Сходить в магазин, купить %s, %s. Слепить пельмени. \nСварить. Полить %s.");

        RecipeService.printRecipe(pelmeni);

        //здесь мы уже можем готовить блюда - создаем повара и рецепт у которого есть время приготовления
        FamousCook stevenSeagal  = new FamousCook("Steven Seagal", 100, 1);
        CookingRecipe shavuha = new CookingRecipe("ШАВУХА", new String[]{"мясо", "лаваш", "овощи"},
                "Срезать %s с вертела, положить в %s. Добавить %s и завернуть.", Duration.parse("PT15M"), "Middle-east");
        RecipeService.printCookingProcess(shavuha, stevenSeagal);

        /* переходим на приготовление американских блюд*/

        Cook gordonRamsy  = new McDonaldsCook("Gordon Ramsy", 100);
        CookingRecipe burger = new CookingRecipe("БУРГЕР", new String[]{"котлетка", "булочка", "овощи"},
                "Пожарить %s, разрезать %s и добавить %s", Duration.parse("PT10M"), "American");
        RecipeService.printCookingProcess(burger, gordonRamsy);
    }

    private static void printMe(String message, int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(message);
        }
    }
}
