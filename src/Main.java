/*
ностью магии, чем Захария Смит.

Важно: поля объектов должны быть приватными.
*/

public class Main {
    public static void main(String[] args) {

        Gryffindor potter = new Gryffindor("Гарри Поттер", 80, 85, 70, 90, 95);
        Gryffindor granger = new Gryffindor("Гермиона Грейнджер", 100, 90, 80, 85, 90);
        Gryffindor weasley = new Gryffindor("Рон Уизли", 75, 80, 65, 80, 85);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 90, 60, 80, 80, 75, 90);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 80, 70, 85, 70, 85, 95);
        Ravenclaw belby = new Ravenclaw("Маркус Белби", 70, 80, 90, 60, 95, 85);

        Hufflepuff smit = new Hufflepuff("Захария Смит", 85, 75, 70, 90, 85);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори", 75, 90, 80, 95, 95);
        Hufflepuff finch = new Hufflepuff("Джастин Финч-Флетчли", 80, 80, 90, 85, 75);

        Slytherin malfoy = new Slytherin("Драко Малфой", 80, 85, 85, 75, 90, 90, 100);
        Slytherin montegy = new Slytherin("Грэхэм Монтегю", 75, 75, 80, 85, 65, 80, 80);
        Slytherin goil = new Slytherin("Грегори Гойл", 65, 65, 75, 90, 55, 70, 70);

        Hogwarts.comparisonTwoStudentsTransgressDistance(weasley, patil);
        Hogwarts.comparisonTwoStudentsMagicPower(granger, chang);
        Hogwarts.comparisonTwoStudentsMagicPower(diggory, montegy);
        Hogwarts.comparisonTwoStudentsTransgressDistance(potter, malfoy);
        Gryffindor.comparisonTwoStudentsPrivateSkills(potter, granger);
        Ravenclaw.comparisonTwoStudentsPrivateSkills(chang, belby);
        Hufflepuff.comparisonTwoStudentsPrivateSkills(smit, finch);
        Slytherin.comparisonTwoStudentsPrivateSkills(malfoy, goil);

        System.out.println(potter.toString());
        System.out.println(chang.toString());
        System.out.println(diggory.toString());
        System.out.println(malfoy.toString());
    }
}