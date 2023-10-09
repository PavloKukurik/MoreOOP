package java.kick;
import lotr.Character;

public class ElfStrategy implements KickStrategy{

    @Override
    public void kick(Character whoKick, opponent Character) {
        if (opponent.getPower() < whoKick.getPower()) {
            opponent.setHp(0);
        } else {
            opponent.setPower(opponent.getPower() - 1);
        }
    }
    
}
