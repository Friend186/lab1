package item.weapon;

import item.base.BaseWeapon;
import item.usage.Upgradable;

public class Sword extends BaseWeapon implements Upgradable {
    private int level;
    private final int  MAX_LEVEL ;
    private final int[] ATT;
    public Sword(){
        super("Sword",15,1);
        ATT = new int[]{3,5,8,12};
        MAX_LEVEL =3;
    }
    public int getAtt(){
        return ATT[getLevel()];
    }
    public void setLevel(int level){
        if(level > MAX_LEVEL || level <0){
            level =0;
        }
        this.level =level;
    }

    @Override
    public String toString() {
        return getName()+" (Att: "+getAtt()+", Range: "+getRange()+", Level: "+getLevel()+", "+getDurability()+" uses left)";
    }
    public int getLevel(){
        return this.level;
    }
    public int getMaxLevel(){
        return MAX_LEVEL;
    }

}
