public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magicPower, int transgressDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressDistance);
        this.nobility = nobility;
        this.courage = courage;
        this.honor = honor;
    }
    private int sumPrivateSkills() {
        return nobility + honor + courage;
    }
    public static void comparisonTwoStudentsPrivateSkills(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if(gryffindor1.sumPrivateSkills() > gryffindor2.sumPrivateSkills()) {
            System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
        }
        else if(gryffindor2.sumPrivateSkills() > gryffindor1.sumPrivateSkills()) {
            System.out.println(gryffindor2.getName() + " лучший Гриффиндорец, чем " + gryffindor1.getName());
        }
        else {
            System.out.println(gryffindor1.getName() + " и " + gryffindor2.getName() + " одинаковые по мастерству Гриффиндорцы");
        }
    }

    @Override
    public String toString() {
        return "Имя студента: " + getName() + ", cила магии: " + getMagicPower() + ", расстояние трансгрессии: " + getTransgressDistance() + ", благородство: " + nobility + ", честь: " + honor + ", храбрость: " + courage;
    }
}
