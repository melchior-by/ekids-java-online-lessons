package by.epam.ekids.recepies;

import java.time.Duration;
// 2 концепции:
// 1 - один класс может наследовать методы и поля друго
// 2 - любой класс может заявить что он реализует какой-либо интерфейс,
//     что означает что у него будут реализованы методы этого интерфейса

//CookingRecipe - наследник, RecipeRecord - родительский класс
public class CookingRecipe extends RecipeRecord implements HaveCookingTime {

    private Duration timeToCook;

    public CookingRecipe(String aName, String[] ingredients, String instructions, Duration duration) {
        //  super - обращение к соответствующей конструкции в наследуемом классе
        super(aName, ingredients, instructions);
        timeToCook = duration;
    }

    public Duration getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(Duration timeToCook) {
        this.timeToCook = timeToCook;
    }

    //012
    //PT
    // аннотация @Override служит для того чтобы показать, что мы переопределяем методы
    // или родителя или из интерфейса
    @Override
    public String getCookingTime() {
        return String.valueOf(timeToCook).substring(2);
    }
}
