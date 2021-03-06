package by.epam.ekids;

import by.epam.ekids.cybersport.Match;
import by.epam.ekids.cybersport.Player;
import by.epam.ekids.cybersport.Tournament;
import by.epam.ekids.game.Display;
import by.epam.ekids.game.Game;
import by.epam.ekids.kitchen.Cook;
import by.epam.ekids.kitchen.FamousCook;
import by.epam.ekids.kitchen.McDonaldsCook;
import by.epam.ekids.programmer.JavaProgrammer;
import by.epam.ekids.recepies.CookingRecipe;
import by.epam.ekids.recepies.RecipeRecord;
import by.epam.ekids.recepies.RecipeService;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
    *           |  =
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

    //главный метод для уроков 1-5, никогда! не называйте так методы
    public static void lessons_1_5_main(String[] args) throws InterruptedException {

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

    public static void main_computer_game(String[] args) {
        Player jove = new Player("Jove", 10);
        Player lewsha = new Player("Lewsha", 100);

        /*
        *  ArrayList имплементит интерфейс List
        *  это самая простая коллекция - выглядит как список в который вы заносите элементы
        *  список автоматически расширяется и сжимается когда это нужно.
        *  Рекомендуемый способ создания ArrayList:
        *  Ссылка типа List указывающая на обект хранящий в себе Player = new ArrayList<>();
        *  В <> указываем тип хранимых объектов
        *  Поскольку мы указали какие объекты мы будем хранить в самой ссылке - после new ArrayList можем оставить пустые  <>
        * */
        List<Player> team1 = new ArrayList<>();
        //метод add() используется для добавления элементов в List
        team1.add(jove);

        List<Player> team2 = new ArrayList<>();
        team2.add(lewsha);

        Match round1 = new Match(team1, team2);
        Tournament minskCup = new Tournament("Minsk Cup", new String[]{"Microsoft", "Apple"}, round1);
        minskCup.run();
    }

    /*Чтобы рисовать интерфейс пользователя нам нужны GUI библиотеки
    * Для Java самые популярные:
    * 1. AWT
    * 2. Swing
    * 3. JavaFx
    *
    * Чтобы работать бэкн-энд программистов нужны web и общего назначения библиотеки:
    * 1. Spring
    * + библиотеки для работы с данными:
    * 1. Hibernate
    *
    * */


    /*
    * Static :
    * 1. Метод - может быть выполнен без создания класса, оперирует данными не только экзепляра класса, но и класса самого
    * 2. Переменные - принадлежат классу, общие для всех экземпляров
    * 3. Классы
    *
    * HashSet имплементит Set
    * Set - это коллекции которые содержат уникальные элементы
    * */

    public static void main_static(String[] args) {
        JavaProgrammer vasya = new JavaProgrammer(100);
        JavaProgrammer petya = new JavaProgrammer(50);
        JavaProgrammer.skill = 100500;
        System.out.println("Vasya weights " + vasya.getWeight() + ", Petya weights " + petya.getWeight());

        // не обращайтесь к статическим переменным через объекты, используйсте обращение через имя класса
        System.out.println("Vasya skill " + vasya.skill + ", Petya skill " + petya.skill);
        System.out.println("JavaProgrammer skill " + JavaProgrammer.skill);

        JavaProgrammer.skill = 146;
        System.out.println("\nVasya skill " + vasya.skill + ", Petya skill " + petya.skill);
        System.out.println("JavaProgrammer skill " + JavaProgrammer.skill);

        //так не надо делать
        vasya.writeCode();
        petya.writeCode();
        //а так можно
        JavaProgrammer.writeCode();
    }

    public static void main_set(String[] args) {
        //можем добавлять повторяющиеся значения
        ArrayList<String> rockets = new ArrayList<>();
        rockets.add("Apolon 1");
        rockets.add("Apolon 1");
        rockets.add("Apolon 2");

        //повторяющиеся значения не добавляются
        HashSet<String> planets = new HashSet<>();
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Earth");

        //темная магия стримов и функциональных интерфейсов
        rockets.forEach(System.out::println);
        System.out.println();
        planets.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Game vasyaVSpetya = new Game();
        vasyaVSpetya.goO(0);
        vasyaVSpetya.goX(1);
        Display.showBoard(vasyaVSpetya.getBoard());
    }

}
