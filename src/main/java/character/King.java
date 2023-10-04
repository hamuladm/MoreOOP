package character;

public class King extends Character{

    public static AttrGen generator = new AttrGen();
    public King(int power, int hp){
        super(generator.GenPow(5, 15), generator.GenHp(5, 15));
    }

    @Override
    public void kick(Character opponent){
        opponent.setHp(getHp() - opponent.getHp());
    }
}
