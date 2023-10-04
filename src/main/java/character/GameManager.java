package character;

public class GameManager {
    public void game(Character b1, Character b2){
        Class<? extends character.Character> bajets1 = b1.getClass();
        Class<? extends character.Character> bajets2 = b2.getClass();

        while (b1.isAlive() || b2.isAlive()){
            System.out.println(bajets1 + "'s characteristics: HP -> " + b1.getHp() + "Power -> " + b1.getPower());
            System.out.println(bajets2 + "'s characteristics: HP -> " + b2.getHp() + "Power -> " + b2.getPower());

            b1.kick(b2);
            System.out.println(bajets1 + " kicked!");
            b2.kick(b1);
            System.out.println(bajets2 + " kicked!");
        }

        if (b1.isAlive()){
        System.out.println("Game over!" + bajets2 + "died :(");
        }
        else{
            System.out.println("Game over!" + bajets1 + "died :(");
        }
    }
}
