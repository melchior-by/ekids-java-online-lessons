package by.epam.ekids.recepies;

import by.epam.ekids.kitchen.AmericanFoodCooking;
import by.epam.ekids.kitchen.Cook;

import java.util.Arrays;

public class RecipeService {

    public static void printRecipe(RecipeRecord recipe) {
        // сервисные переменные чтобы красиво распечатать
        String beautyIngredients =
                "Ингридиенты: " + Arrays.toString(recipe.getIngredients()).replace("[", "").replace("]", "") + ".";
        String beautyInstruction = String.format(recipe.getInstructions(), recipe.getIngredients()[0], recipe.getIngredients()[1],
                        recipe.getIngredients()[2]);

        // основная цель данного метода - напечатать весь рецепт красиво
        System.out.println("\nРецепт " + recipe.getName() + "!!!\n" + beautyIngredients + "\n" + beautyInstruction);
    }

    public static void printCookingProcess(CookingRecipe recipe, Cook cook) throws InterruptedException {
        String cookName = cook.getName();
        String recipeName = recipe.getName();

        //с помощью instanceof мы проверяем что объект реализует интерфейс AmericanFoodCooking
        if (recipe.getTypeCuisine().equals("American") || cook instanceof AmericanFoodCooking) {
            System.out.println("\nНаш повар может готовить американский блюда");
            System.out.println(cookName + " готовит блюдо в следующей последовтельности: ");

            // сервисные переменные чтобы красиво распечатать
            String beautyInstruction = String
                    .format(recipe.getInstructions(), recipe.getIngredients()[0], recipe.getIngredients()[1], recipe.getIngredients()[2]);

            System.out.println(beautyInstruction);
            System.out.println("Время приготовления: " + getTimeToCook(recipe, cook));
            //эмулируем время приготовления
            Thread.sleep(5000);
            System.out.println("Блюдо " + recipeName + " приготовлено");
            System.out.println("Зацени какой у нас повар крутой, оригинальное время приготовления рецепта - " + recipe
                    .getCookingTime());
        } else {
            System.out.println("\nНаш повар не может готовить американский блюда");
        }



    }

    private static String getTimeToCook(CookingRecipe recipe, Cook cook) {
        return String.valueOf(recipe.getTimeToCook().minusMinutes((long) (cook.getCoolness() * 0.2)));
    }

}
