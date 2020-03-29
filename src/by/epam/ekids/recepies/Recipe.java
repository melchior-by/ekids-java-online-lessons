package by.epam.ekids.recepies;

import java.util.Arrays;

//DATA класс
public class Recipe {
    // поля класса делаем private - они недоступны извне класса
    private String[] ingredients;
    private String instructions;

    // с помощью get методов регулируем, какие данные мы можем выдавать за пределы класса и в каком виде
    public String[] getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    // с помощью set методов обеспечиваем заполнение внутренних полей класса (String[] ingredients и String instructions)
    public void setIngredients(String[] anIngredients) {
        ingredients = anIngredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" + "ingredients=" + Arrays.toString(ingredients) + ", instructions='" + instructions + '\''
                + '}';
    }
}
