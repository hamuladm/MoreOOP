package character;

public class AttrGen {
    public int GenHp(int from, int to){
        return from + (int)(Math.random() * ((from - to) + 1));
    }

    public int GenPow(int from, int to){
        return from + (int)(Math.random() * ((from - to) + 1));
    }
}
