package by.epam.ekids.programmer;

public class JavaProgrammer {
    // общая переменная для всех Java программистов
    public static Integer skill;
    Integer weight;

    public JavaProgrammer(Integer weight) {
        this.weight = weight;
    }

    // общий метод для всех экземпляров класса - метод класса
    public static void writeCode() {
        System.out.println("We write code");
    }

    public static Integer getSkill() {
        return skill;
    }

    public static void setSkill(Integer skill) {
        JavaProgrammer.skill = skill;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
