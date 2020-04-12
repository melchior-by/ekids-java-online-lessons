package by.epam.ekids.kitchen;

public class Cook {
    private String name;
    //1..100
    private Integer coolness;

    public Cook(String name, Integer coolness) {
        this.name = name;
        this.coolness = coolness;
    }

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
}
