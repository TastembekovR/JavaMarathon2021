package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        magicAtt = 15;
        physAtt = 10;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        }
        health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > 100) {
            hero.health = 100;
        } else {
            hero.health += 30;
        }
    }

    public void magicalAttack(Hero hero) {
        double mAttack = magicAtt - (magicAtt * hero.magicDef);
        if (hero.health - mAttack < 100) {
            hero.health = 0;
        } else {
            hero.health -= mAttack;
        }
    }
}
