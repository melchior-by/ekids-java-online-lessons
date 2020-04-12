package by.epam.ekids.recepies;

import by.epam.ekids.kitchen.Cook;

import java.util.Arrays;

public class RecipeService {

    public static void printRecipe(Recipe recipe) {
        // сервисные переменные чтобы красиво распечатать
        String beautyIngredients = "Ингридиенты: " +
                Arrays.toString(recipe.getIngredients()).replace("[", "").replace("]", "") + ".";
        String beautyInstruction = String.format(recipe.getInstructions(),
                recipe.getIngredients()[0], recipe.getIngredients()[1], recipe.getIngredients()[2]);

        // основная цель данного метода - напечатать весь рецепт красиво
        System.out.println("\nРецепт " + recipe.getName() + "!!!\n" + beautyIngredients + "\n" + beautyInstruction);
    }

    public static void printCookingProcess(Recipe recipe, Cook cook) throws InterruptedException {
        String cookName = cook.getName();
        String recipeName = recipe.getName();

        System.out.println("\nПовар " + cookName + " приступил к приготовлению " + recipeName);
        System.out.println(cookName + " готовит блюдо в следующей последовтельности: ");

        // сервисные переменные чтобы красиво распечатать
        String beautyInstruction = String.format(recipe.getInstructions(),
                recipe.getIngredients()[0], recipe.getIngredients()[1], recipe.getIngredients()[2]);

        System.out.println(beautyInstruction);
        System.out.println("Время приготовления: " + getTimeToCook(recipe, cook));
        Thread.sleep(15000);
        System.out.println("Блюдо " + recipeName + " приготовлено");
    }

    private static String getTimeToCook(Recipe recipe, Cook cook) {
        return String.valueOf(recipe.getTimeToCook().minusMinutes((long) (cook.getCoolness() * 0.2)));
    }

}
