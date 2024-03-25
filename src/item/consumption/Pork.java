package item.consumption;

import item.base.BaseConsumption;
import item.usage.CookState;
import item.usage.Cookable;
import item.usage.Healable;

import java.util.HashMap;

public class Pork extends BaseConsumption implements Cookable, Healable {
    private CookState cookState;
    private final HashMap<CookState, Integer> RECOVER_PT;
    public Pork(){
        super("Pork");
        setCookState(CookState.RAW);
        RECOVER_PT = new HashMap<>();
        RECOVER_PT.put(CookState.RAW, 1);
        RECOVER_PT.put(CookState.COOKED, 2);
        RECOVER_PT.put(CookState.BURNT, 0);
    }
    @Override
    public int getRecoverPoint() {
        return RECOVER_PT.get(getCookState());
    }

    @Override
    public void setCookState(CookState cookState) {
        this.cookState = cookState;
    }
    public CookState getCookState() {
        return cookState;
    }
    public String toString() {
        String s;
        switch (getCookState()) {
            case RAW -> { s = "Raw"; }
            case COOKED -> { s = "Cooked"; }
            case BURNT -> {s = "Burnt"; }
            default -> {s = "";}
        }
        return s + " " + getName() + " (+" + getRecoverPoint() + " HP)";
    }
}
