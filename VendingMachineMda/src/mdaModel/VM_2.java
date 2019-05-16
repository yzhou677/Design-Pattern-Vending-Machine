package mdaModel;

import abstractFactory.Abstract_Factory;
import abstractFactory.Abstract_Factory2;

public class VM_2 {
    private MDA_EFSM mda_efsm;
    private DataStore dataStore_2;
    private Abstract_Factory abstract_factory;
    private OP op;

    public VM_2() {
        dataStore_2 = new DataStore_2();
        abstract_factory = new Abstract_Factory2((DataStore_2) dataStore_2);
        op = new OP();
        op.initialize(abstract_factory);
        mda_efsm = new MDA_EFSM(op);
    }

    public void CREATE(float p) {
        ((DataStore_2) dataStore_2).setTempP(p);
        mda_efsm.create();
    }
    public void COIN(float v) {
        ((DataStore_2) dataStore_2).setTempV(v);
       if (((DataStore_2) dataStore_2).getCf() + v >= ((DataStore_2) dataStore_2).getPrice()) {
           mda_efsm.coin(1);
       } else {
           mda_efsm.coin(0);
       }
    }
    public void SUGAR() {
        mda_efsm.additive(2);
    }
    public void CREAM() {
        mda_efsm.additive(1);
    }
    public void COFFEE() {
        mda_efsm.dispose_drink(1);
    }
    public void InsertCups(int n) {
        mda_efsm.insert_cups(n);
    }
    public void SetPrice(float p) {
        ((DataStore_2) dataStore_2).setTempP(p);
        mda_efsm.set_price();
    }
    public void CANCEL() {
        mda_efsm.cancel();
    }

}