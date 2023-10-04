package character;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public abstract class Character {
    @Getter @Setter
    private int power;
    @Getter
    private int hp;

    public abstract void kick(Character opponent);

    public boolean isAlive(){
        return (getHp() > 0);
    }
    public void setHp(int hp){
        this.hp = hp > 0 ? hp: 0;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
