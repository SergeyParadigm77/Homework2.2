public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressDistance;

    public Hogwarts(String name, int magicPower, int transgressDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }
    public static void comparisonTwoStudentsMagicPower(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1.getMagicPower() > hogwarts2.getMagicPower()) {
            System.out.println(hogwarts1.getName() + " обладает большей мощностью магии, чем " + hogwarts2.getName());
        }
        else if(hogwarts1.getMagicPower() < hogwarts2.getMagicPower()) {
            System.out.println(hogwarts2.getName() + " обладает большей мощностью магии, чем " + hogwarts1.getName());
        }
        else {
            System.out.println(hogwarts2.getName() + " и "+ hogwarts1.getName() + " обладают равной мощностью магии");
        }
    }
    public static void comparisonTwoStudentsTransgressDistance(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getName() + " обладает большим расстоянием трансгрессии, чем " + student2.getName());
        }
        else if(student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " обладает большим расстоянием трансгрессии, чем " + student1.getName());
        }
        else {
            System.out.println(student2.getName() + " и "+ student1.getName() + " обладают равным расстоянием трансгрессии");
        }
    }
}

