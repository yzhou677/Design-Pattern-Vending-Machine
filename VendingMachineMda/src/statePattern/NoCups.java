//state pattern
package statePattern;

import mdaModel.OP;

public class NoCups extends MDAState {
    public NoCups(OP op, StateDataStore d) {
        super(op, d);
        id = 1;
    }

    public void coin(int f) {
        op.ReturnCoins(0);
    }

    @Override
    public void set_price() {

    }

    @Override
    public void card() {

    }

    @Override
    public void additive(int a) {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void dispose_drink(int d) {

    }

    @Override
    public void create() {

    }

    public void insert_cups(int n) {
        stateDataStore.setNumberOfCups(n);
        op.ZeroCF();
    }
}