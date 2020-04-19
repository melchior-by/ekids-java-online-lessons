package by.epam.ekids.recepies;

import java.util.Arrays;

public class RecipeRecord {
    // !!!ПОЛЯ!!!
    // поля класса делаем private - они недоступны извне класса
    private String name;
    private String[] ingredients;
    private String instructions;

    // !!!КОНСТРУКТОРЫ!!!
    public RecipeRecord(String aName, String[] ingredients, String instructions) {
        name = aName;
        this.ingredients = ingredients;
        this.instructions = instructions;
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

    // !!!ОСТАЛЬНЫЙ МЕТОДЫ!!!
    @Override
    public String toString() {
        return "Recipe{" + "ingredients=" + Arrays.toString(ingredients) + ", instructions='" + instructions + '\''
                + '}';
    }
}
