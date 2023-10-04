package character;

public class Elf extends Character{

    public Elf(int power, int hp){
        super(10, 10);
    }

    @Override
    public void kick(Character opponent){
        if (getPower() > opponent.getPower()){
            opponent.setPower(0);
        }
        else {
            opponent.setPower(opponent.getPower() - 1);
        }
    }
}
