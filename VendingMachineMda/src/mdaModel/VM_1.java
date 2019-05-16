package mdaModel;

import abstractFactory.Abstract_Factory;
import abstractFactory.Abstract_Factory1;

public class VM_1 {
    private DataStore dataStore_1;
    private Abstract_Factory abstract_factory;
    private OP op;
    private MDA_EFSM mda_efsm;

    public VM_1() {
        dataStore_1 = new DataStore_1();
        abstract_factory = new Abstract_Factory1((DataStore_1)dataStore_1);
        op = new OP();
        op.initialize(abstract_factory);
        mda_efsm = new MDA_EFSM(op);
    }

    public void create(int p) {
        ((DataStore_1)dataStore_1).setTempP(p);
        mda_efsm.create();
    }

    public void coin(int v) {
        ((DataStore_1)dataStore_1).setTempV(v);
        if (((DataStore_1)dataStore_1).getCf() + v >= ((DataStore_1)dataStore_1).getPrice()) {
            mda_efsm.coin(1);
        } else {
            mda_efsm.coin(0);
        }
    }

    public void card(float x) {
        if (x >= ((DataStore_1)dataStore_1).getPrice()) {
            mda_efsm.card();
        }
    }

    public void sugar() {
        mda_efsm.additive(1);
    }

    public void tea() {
        mda_efsm.dispose_drink(1);
    }

    public void chocolate() {
        mda_efsm.dispose_drink(2);
    }

    public void insert_cups(int n) {
        mda_efsm.insert_cups(n);
    }

    public void set_price(int p) {
        ((DataStore_1)dataStore_1).setTempP(p);
        mda_efsm.set_price();
    }

    public void cancel() {
        mda_efsm.cancel();
    }

}