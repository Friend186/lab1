package table;

import item.base.BaseItem;
import item.usage.Upgradable;

public class Enchanter extends BaseTable {

    public Enchanter() {
        super("Enchanter");
    }

    @Override
    public String interact(BaseItem item) {
        // FILL CODE
        if(item instanceof Upgradable){
            if(((Upgradable) item).getLevel()+1<=((Upgradable) item).getMaxLevel()){
                ((Upgradable) item).setLevel(((Upgradable) item).getLevel()+1);
                return "Upgrade successfully";
            }
            else{
                return "Already max level";
            }
        }
        return "This item cannot be upgraded";
    }
}
