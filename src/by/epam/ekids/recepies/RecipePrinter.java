package by.epam.ekids.recepies;

import java.util.Arrays;

public class RecipePrinter {

    public static void print(Recipe recipe) {
        // сервисные переменные чтобы красиво распечатать
        String beautyIngredients = "Ингридиенты: " +
                Arrays.toString(recipe.getIngredients()).replace("[", "").replace("]", "") + ".";
        String beautyInstruction = String.format(recipe.getInstructions(),
                recipe.getIngredients()[0], recipe.getIngredients()[1], recipe.getIngredients()[2]);

        // основная цель данного метода - напечатать весь рецепт красиво
        System.out.println("\nРецепт " + recipe.getName() + "!!!\n" + beautyIngredients + "\n" + beautyInstruction);
    }
}
