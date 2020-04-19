package by.epam.ekids.kitchen;

//abstract - запрещает создавать объекты, показывает что это базовый класс для построения можели наследования
public abstract class Cook {
    private String name;
    //1..100
    private Integer coolness;

    public Cook(String name, Integer coolness) {
        this.name = name;
        this.coolness = coolness;
    }

    // могут быть как полноценные методы
    public String getName() {
        return name;
    }

    public Integer getCoolness() {
        return coolness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoolness(Integer coolness) {
        this.coolness = coolness;
    }

    //так и абстрактные
    public abstract void sayHi();

}
