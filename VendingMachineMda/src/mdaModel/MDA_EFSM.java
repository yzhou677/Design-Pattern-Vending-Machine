package mdaModel;

import statePattern.*;

public class MDA_EFSM {
    private MDAState S; // current state
    private MDAState[] LS = new MDAState[4]; // all states
    private StateDataStore stateDataStore = new StateDataStore();

    public MDA_EFSM(OP op) {
        LS[0] = new Start(op, stateDataStore);
        LS[1] = new NoCups(op, stateDataStore);
        LS[2] = new Idle(op, stateDataStore);
        LS[3] = new CoinsInserted(op, stateDataStore);
        S = LS[0];
    }

    public void create() {
        S.create();
        if (S.getId() == 0) {
            S = LS[1];
            System.out.println("  State : NO CUP. Please insert cups.");
        }
    }

    public void insert_cups(int n) {
        if (n > 0) {
            S.insert_cups(n);
            if (S.getId() == 1) {
                S = LS[2];
                System.out.println("  State : IDLE. Please insert coin.");
            }
        }

    }

    public void coin(int f) {
        S.coin(f);
        if (f == 1 && S.getId() == 2) {
            S = LS[3];
            System.out.println("  State : COIN INSERTED");
        }
    }

    public void card() {
        S.card();
        if (S.getId() == 2) {
            S = LS[3];
            System.out.println("  State : COIN INSERTED");
        }
    }

    public void cancel() {
        S.cancel();
        if(S.getId() == 3) {
            S = LS[2];
            System.out.println("  State : IDLE");
        }
    }

    public void set_price() {
        S.set_price();
    }

    public void dispose_drink(int d) {
        int numberOfCups = this.stateDataStore.getNumberOfCups();
        S.dispose_drink(d);
        if ( numberOfCups > 1 && S.getId() == 3) {
            S = LS[2];
            System.out.println("  State : IDLE");
        } else if (numberOfCups <= 1 && S.getId() == 3) {
            S = LS[1];
            System.out.println("  State : NO CUP");
        }
    }

    public void additive(int a) {
        S.additive(a);
    }
}