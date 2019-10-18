package playerTypes;

import abilities.IHack;
import characters.Player;

public class Hacker extends Player implements IHack {
    public Hacker(String name) {
        super(name);
    }

    public String hack(){
        return "I'm in, time for data extraction.";
    }
}