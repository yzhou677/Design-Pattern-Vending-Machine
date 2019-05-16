// centralized state pattern
package statePattern;

import mdaModel.OP;

public abstract class MDAState {
    protected OP op;
    protected int id;
    protected StateDataStore stateDataStore;
    public MDAState(OP op, StateDataStore stateDataStore) {
        this.op = op;
        this.stateDataStore = stateDataStore;
    }
    public abstract void create();              //abstract operation 
    public abstract void insert_cups(int n);        //abstract operation
    public abstract void coin(int f);               //abstract operation
    public abstract void set_price();               //abstract operation
    public abstract void card();                    //abstract operation
    public abstract void additive(int a);           //abstract operation
    public abstract void cancel();                  //abstract operation
    public abstract void dispose_drink(int d);      //abstract operation
    public int getId() {
        return id;
    }

}