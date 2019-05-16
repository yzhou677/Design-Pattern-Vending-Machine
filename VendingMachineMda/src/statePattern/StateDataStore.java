// state pattern
package statePattern;

import java.util.ArrayList;

public class StateDataStore {
    private int numberOfCups = 0;
    private ArrayList<Integer> additive = new ArrayList<>();

    public ArrayList<Integer> getAdditive() {
        return additive;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public void setAdditive(ArrayList<Integer> additive) {
        this.additive = additive;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }
}
