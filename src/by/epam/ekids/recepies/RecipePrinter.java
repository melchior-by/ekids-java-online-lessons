package by.epam.ekids.recepies;

import java.util.Arrays;

public class RecipePrinter {

    public static void print() {
        // создаем объект рецепта пельменей
        Recipe pelmeni = new Recipe();
        // с помощью set методов задаем его поля (ингридиенты и инструкцию по приготовлению)
        pelmeni.setIngredients(new String[]{"мясо", "тесто", "сметанкой"});
        pelmeni.setInstructions("Сходить в магазин, купить %s, %s. Слепить пельмени. \nСварить. Полить %s.");
        // сервисные переменные чтобы красиво распечатать
        String beautyIngredients = "Ингридиенты: " + Arrays.toString(pelmeni.getIngredients()) + ".";
        String beautyInstruction = String.format(pelmeni.getInstructions(), pelmeni.getIngredients()[0], pelmeni.getIngredients()[1], pelmeni.getIngredients()[2]);
        // основная цель данного метода - напечатать весь рецепт красиво
        System.out.println("Рецепт ПЕЛЬМЕНЕЙ!!!\n" + beautyIngredients + "\n" + beautyInstruction);
    }
}
