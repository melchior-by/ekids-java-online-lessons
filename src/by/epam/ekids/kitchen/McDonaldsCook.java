package by.epam.ekids.kitchen;

public class McDonaldsCook extends Cook implements AmericanFoodCooking {
    public McDonaldsCook(String name, Integer coolness) {
        super(name, coolness);
    }

    //из абстрактного класс Cook за счет наследования
    @Override
    public void sayHi() {
        System.out.println("Привет это повар из макдака - " + getName());
    }

    //
    @Override
    public Boolean canCookAmericanFood() {
        return true;
    }
}
