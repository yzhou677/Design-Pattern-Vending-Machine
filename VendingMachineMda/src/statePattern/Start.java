// state pattern
package statePattern;

import mdaModel.OP;

public class Start extends MDAState {
    public Start(OP op, StateDataStore d) {
        super(op, d);
        id = 0;
    }
    public void create() {
        op.StorePrice();
       }

    @Override
    public void insert_cups(int n) {

    }

    @Override
    public void coin(int f) {

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
}