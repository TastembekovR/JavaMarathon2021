package day6;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student x) {
        int min = 2;
        int max = 5;
        int rand = min + (int) (Math.random() * max);
        String ocenka = "";
        switch (rand) {
            case 2:
                ocenka = "неудовлетворительно";
                break;
            case 3:
                ocenka = "удовлетворительно";
                break;
            case 4:
                ocenka = "хорошо";
                break;
            case 5:
                ocenka = "отлично";
                break;
            default:
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + x.getName() + " по предмету " + subject + " на оценку " + ocenka);
    }
}
