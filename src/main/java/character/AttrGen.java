package character;

import java.util.Random;

public class AttrGen {
    public int GenHp(int from, int to){
        Random random = new Random();
        return random.nextInt(to - from) + from;
    }

    public int GenPow(int from, int to){
        Random random = new Random();
        return random.nextInt(to - from) + from;
    }
}
