package character;

public class Hobbit extends Character{

    public Hobbit(int power, int hp){
        super(0, 3);
    }

    @Override
    public void kick(Character opponent){
        System.out.println("😭😭😭");
    }
}
