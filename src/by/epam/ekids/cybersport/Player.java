package by.epam.ekids.cybersport;

public class Player {
    private String name;
    private Integer skill;

    public Player(String name, Integer skill) {
        this.name = name;
        this.skill = skill;
    }

    //такое разбиенеие полезно когда у вас много переменных и методов
    //геттеры
    public String getName() {
        return name;
    }

    public Integer getSkill() {
        return skill;
    }

    //сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

}
