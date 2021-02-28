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
        switch (rand) {
            case 2:
                System.out.println("Преподаватель " + name + " оценил студента с именем " + x.name + " по предмету " + subject + " на оценку " + "неудовлетворительно");
                break;
            case 3:
                System.out.println("Преподаватель " + name + " оценил студента с именем " + x.name + " по предмету " + subject + " на оценку " + "удовлетворительно");
                break;
            case 4:
                System.out.println("Преподаватель " + name + " оценил студента с именем " + x.name + " по предмету " + subject + " на оценку " + "хорошо");
                break;
            case 5:
                System.out.println("Преподаватель " + name + " оценил студента с именем " + x.name + " по предмету " + subject + " на оценку " + "отлично");
                break;
        }
    }
}
