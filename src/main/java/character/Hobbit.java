package character;


public class Hobbit extends Character{

    public Hobbit(){
        super(0, 3);
    }

    @Override
    public void kick(Character opponent){
        System.out.println("😭😭😭");
    }
}
