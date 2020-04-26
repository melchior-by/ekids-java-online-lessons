package by.epam.ekids.kitchen;

public class FamousCook extends Cook {

    private Integer rewards;

    public FamousCook(String name, Integer coolness, Integer rewards) {
        super(name, coolness);
        this.rewards = rewards;
    }

    public Integer getRewards() {
        return rewards;
    }

    public void setRewards(Integer rewards) {
        this.rewards = rewards;
    }

    @Override
    public void sayHi() {
        System.out.println("Привет это известный повар " + getName());
    }
}
