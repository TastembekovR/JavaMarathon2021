package day11.task2;

public class Magician extends Hero implements MagicAttack {

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        magicAtt = 20;
        physAtt = 5;
    }

    public void magicalAttack(Hero hero) {
        double mAttack = magicAtt - (magicAtt * hero.magicDef);
        if (hero.health - mAttack < 0) {
            hero.health = 0;
        } else {
            hero.health -= mAttack;
        }
    }
}