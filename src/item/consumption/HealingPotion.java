package item.consumption;

import item.base.BaseConsumption;
import item.usage.Healable;
import item.usage.Upgradable;

public class HealingPotion extends BaseConsumption implements Healable, Upgradable {
    private int level;
    private final int MAX_LEVEL;
    private final int[] RECOVER_PT;
    public HealingPotion(){
        super("HealingPotion");
        setLevel(0);
        MAX_LEVEL =3;
        RECOVER_PT =new int[]{3,5,7,10};
    }
    public int getRecoverPoint(){
        return RECOVER_PT[getLevel()];
    }

    @Override
    public void setLevel(int level) {
        if(level>MAX_LEVEL || level <0){
            level =0;
        }
        this.level = level;
    }

    @Override
    public String toString() {
        return getName()+" (+"+getRecoverPoint()+" HP, Level: "+getLevel()+")";
    }
    public int getLevel(){
        return level;
    }
    public int getMaxLevel(){
        return MAX_LEVEL;
    }
}
