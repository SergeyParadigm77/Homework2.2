public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    private int sumPrivateSkills() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public static void comparisonTwoStudentsPrivateSkills(Slytherin student1, Slytherin student2) {
        if(student1.sumPrivateSkills() > student2.sumPrivateSkills()) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        }
        else if(student2.sumPrivateSkills() > student1.sumPrivateSkills()) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }
        else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаковые по мастерству Слизеринцы");
        }
    }
    @Override
    public String toString() {
        return "Имя студента: " + getName() + ", cила магии: " + getMagicPower() + ", расстояние трансгрессии: " + getTransgressDistance() + ", хитрость: " + cunning + ", решительность: " + determination + ", амбициозность: " + ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + lustForPower;
    }
}