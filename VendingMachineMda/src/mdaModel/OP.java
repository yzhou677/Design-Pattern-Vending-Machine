package mdaModel;

import abstractFactory.Abstract_Factory;
import strategyPattern.*;

import java.util.ArrayList;

public class OP {
    private DataStore d;
    private StorePrice p1;
    private ZeroCF p2;
    private IncreaseCF p3;
    private ReturnCoins p4;
    private DisposeDrink p5;
    private DisposeAdditive p6;
    public void StorePrice() {
        p1.StorePrice();
    }
    public void ZeroCF() {
        p2.ZeroCF();
    }
    public void IncreaseCF() {
        p3.IncreaseCF();
    }
    public void ReturnCoins(int c) {
        p4.ReturnCoins(c);
    }
    public void DisposeDrink(int d) {
        p5.DisposeDrink(d);
    }
    public void DisposeAdditive(ArrayList a) {
        p6.DisposeAdditive(a);
    }
    public void initialize(Abstract_Factory af) {
        d = af.getDataStore();
        p1 = af.getStorePrice();
        p2 = af.getZeroCF();
        p3 = af.getIncreaseCF();
        p4 = af.getReturnCoins();
        p5 = af.getDisposeDrink();
        p6 = af.getDisposeAdditive();
    }
}

