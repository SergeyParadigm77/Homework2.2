public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    private int sumPrivateSkills() {
        return hardworking + loyal + honest;
    }

    public static void comparisonTwoStudentsPrivateSkills(Hufflepuff student1, Hufflepuff student2) {
        if (student1.sumPrivateSkills() > student2.sumPrivateSkills()) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (student2.sumPrivateSkills() > student1.sumPrivateSkills()) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаковые по мастерству Пуффендуйцы");
        }
    }

    @Override
    public String toString() {
        return "Имя студента: " + getName() + ", cила магии: " + getMagicPower() + ", расстояние трансгрессии: " + getTransgressDistance() + ", трудолюбие: " + hardworking + ", верность: " + loyal + ", честность: " + honest;
    }
}
