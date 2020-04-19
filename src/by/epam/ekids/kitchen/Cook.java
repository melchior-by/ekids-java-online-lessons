package by.epam.ekids.kitchen;

public class Cook {
    private String name;
    //1..100
    private Integer coolness;

    private String speciality;

    public Cook(String name, Integer coolness, String speciality) {
        this.name = name;
        this.coolness = coolness;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public Integer getCoolness() {
        return coolness;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoolness(Integer coolness) {
        this.coolness = coolness;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
