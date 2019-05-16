// state pattern
package statePattern;

import mdaModel.OP;

import java.util.ArrayList;

public class CoinsInserted extends MDAState {
    public CoinsInserted(OP op, StateDataStore d) {
        super(op, d);
        id = 3;
    }

    @Override
    public void create() {

    }

    @Override
    public void insert_cups(int n) {

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

    public void additive(int a) {
        ArrayList<Integer> addi = stateDataStore.getAdditive();

        if (addi.contains(a)) {
            addi.remove((Integer) a);
            stateDataStore.setAdditive(addi);
        } else {
            addi.add(a);
            stateDataStore.setAdditive(addi);
        }
    }

    @Override
    public void cancel() {
        op.ReturnCoins(1);
        op.ZeroCF();
    }

    public void dispose_drink(int d) {
        if (this.stateDataStore.getNumberOfCups() > 1) {
            op.DisposeAdditive(this.stateDataStore.getAdditive());
            op.DisposeDrink(d);
            this.stateDataStore.setNumberOfCups(this.stateDataStore.getNumberOfCups() - 1);
            op.ZeroCF();
        } else if (this.stateDataStore.getNumberOfCups() <= 1) {
            op.DisposeAdditive(this.stateDataStore.getAdditive());
            op.DisposeDrink(d);
        }
    }

} 