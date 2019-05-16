// state pattern
package statePattern;

import mdaModel.OP;

import java.util.ArrayList;

public class Idle extends MDAState {
    public Idle(OP op, StateDataStore d) {
        super(op, d);
        id = 2;
    }
    public void coin(int f) {
        op.IncreaseCF();
        if (f == 1) {
            stateDataStore.setAdditive(new ArrayList<>());
        }
    }

    @Override
    public void create() {

    }

    public void insert_cups(int n) {
        if (n > 0) {
            stateDataStore.setNumberOfCups(stateDataStore.getNumberOfCups() + n);
        }
    }

    public void set_price() {
        op.StorePrice();
    }

    public void card() {
        op.ZeroCF();
        stateDataStore.setAdditive(new ArrayList<>());
    }

    @Override
    public void additive(int a) {
        System.out.println("  Not enough money for a drink");

    }

    @Override
    public void cancel() {

    }

    @Override
    public void dispose_drink(int d) {
        System.out.println("  Not enough money for a drink");
    }
}