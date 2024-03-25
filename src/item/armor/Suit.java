package item.armor;

import item.base.BaseArmor;
import item.usage.Upgradable;

public class Suit extends BaseArmor implements Upgradable {
    private int level;
    private  final int  MAX_LEVEL;
    private int[] DEF;
    public Suit(){
        super("Suit",10);
        DEF = new int[]{1, 2, 3, 5};
        MAX_LEVEL =3;
    }
    public int getDef(){
        return DEF[getLevel()];
    }
    public int getLevel(){
        return this.level;
    }
    public void setLevel(int level){
        if(level>MAX_LEVEL || level<0){
            level= 0;
        }
        this.level =level;
    }
    public int getMaxLevel(){
        return MAX_LEVEL;
    }

    @Override
    public String toString() {
        return getName()+" (Def: "+getDef()+", Level: "+getLevel()+")";
    }
}
