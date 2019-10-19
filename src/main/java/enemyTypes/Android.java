package enemyTypes;

import abilities.IDefend;
import characters.Enemy;

public class Android extends Enemy implements IDefend {
    
    public Android(String name) {
        super(name);
    }

    public String defend() {
        return "Android defence systems online.";
    }
}