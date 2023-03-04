public class Ravenclaw extends Hogwarts {
private int smart;
private int wise;
private int witty;
private int fullOfCreativity;

    public Ravenclaw(String name, int magicPower, int transgressDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magicPower, transgressDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    private int sumPrivateSkills() {
        return smart + wise + witty + fullOfCreativity;
    }
    public static void comparisonTwoStudentsPrivateSkills(Ravenclaw student1, Ravenclaw student2) {
        if(student1.sumPrivateSkills() > student2.sumPrivateSkills()) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        }
        else if(student2.sumPrivateSkills() > student1.sumPrivateSkills()) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
        else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаковые по мастерству Когтевранцы");
        }
    }
    @Override
    public String toString() {
        return "Имя студента: " + getName() + ", cила магии: " + getMagicPower() + ", расстояние трансгрессии: " + getTransgressDistance() + ", ум: " + smart + ", мудрость: " + wise + ", остроумие: " + witty + ", творчество: " + fullOfCreativity;
    }
}