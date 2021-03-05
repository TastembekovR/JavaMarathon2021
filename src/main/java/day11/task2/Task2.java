package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Paladin p1 = new Paladin();
        Magician m1 = new Magician();
        Shaman s1 = new Shaman();
        w1.physicalAttack(p1);
        System.out.println(p1);
        p1.physicalAttack(m1);
        System.out.println(m1);
        s1.healTeammate(m1);
        System.out.println(m1);
        m1.magicalAttack(p1);
        System.out.println(p1);
        s1.physicalAttack(w1);
        System.out.println(w1);
        p1.healHimself();
        System.out.println(p1);
        for (int i = 0; i < 5; i++) {
            w1.physicalAttack(m1);
            System.out.println(m1);
        }

    }
}
