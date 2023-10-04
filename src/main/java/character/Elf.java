package character;


public class Elf extends Character{

    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character opponent){
        if (getPower() > opponent.getPower()){
            opponent.setHp(0);
        }
        else {
            opponent.setPower(opponent.getPower() - 1);
        }
    }
}
