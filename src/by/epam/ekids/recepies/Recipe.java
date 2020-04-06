package by.epam.ekids.recepies;

import java.time.Duration;
import java.util.Arrays;

//DATA класс
public class Recipe {
    // !!!ПОЛЯ!!!
    // поля класса делаем private - они недоступны извне класса
    private String name;
    private String[] ingredients;
    private String instructions;
    private Duration timeToCook;

    // !!!КОНСТРУКТОРЫ!!!
    public Recipe(String aName, String[] ingredients, String instructions) {
        name = aName;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Recipe(String aName, String[] ingredients, String instructions, Duration timeToCook) {
        name = aName;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.timeToCook = timeToCook;
    }

    public Recipe() {

    }

    // !!!get и set методы!!!
    // с помощью get методов регулируем, какие данные мы можем выдавать за пределы класса и в каком виде
    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public Duration getTimeToCook() {
        return timeToCook;
    }

    // с помощью set методов обеспечиваем заполнение внутренних полей класса (String[] ingredients и String instructions)
    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String[] anIngredients) {
        ingredients = anIngredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setTimeToCook(Duration timeToCook) {
        this.timeToCook = timeToCook;
    }

    // !!!ОСТАЛЬНЫЙ МЕТОДЫ!!!
    @Override
    public String toString() {
        return "Recipe{" + "ingredients=" + Arrays.toString(ingredients) + ", instructions='" + instructions + '\''
                + '}';
    }
}
