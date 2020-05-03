package by.epam.ekids.cybersport;

public class Tournament {
    private String name;
    private String[] sponsors;
    private Match match;

    public Tournament(String name, String[] sponsors, Match match) {
        this.name = name;
        this.sponsors = sponsors;
        this.match = match;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSponsors() {
        return sponsors;
    }

    public void setSponsors(String[] sponsors) {
        this.sponsors = sponsors;
    }

    public void run() {
        System.out.println("Мы проводим турнир " + name);
        Integer sum = 0;

        /*
        *  Вариант цикла for - foreach
        *  Тип_переменной_заглушки имя_переменной : код_возвращающий_список
        *  Из списка после : достается по елементу и переменной закглушке присваивается ссылка на этот элемент
        *  И так пока не будет перебран весь список        *
        * */
        for (Player i : match.getTeam1()) {
            sum += i.getSkill();
        }

        for (Player i : match.getTeam2()) {
            sum -= i.getSkill();
        }

        if (sum > 0) {
            System.out.println("Комманда 1 победила благодаря скилу " + match.getTeam1().get(0).getName());
            System.out.println("С перевесом в " + sum  + " очков");
        } else {
            System.out.println("Комманда 2 победила благодаря скилу " + match.getTeam2().get(0).getName());
            System.out.println("С перевесом в " + -sum  + " очков");
        }
    }
}
