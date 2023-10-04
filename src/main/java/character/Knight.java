package character;


public class Knight extends Character{

    public static AttrGen generator = new AttrGen();
    public Knight(){
        super(generator.GenPow(2, 12), generator.GenHp(2, 12));
    }

    @Override
    public void kick(Character opponent){
        opponent.setHp(getHp() - opponent.getHp());
    }
}
