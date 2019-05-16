//abstract factory pattern
package abstractFactory;

import mdaModel.DataStore_1;
import strategyPattern.*;
import mdaModel.DataStore;

public class Abstract_Factory1 extends Abstract_Factory {
    private DataStore_1 d;
    public Abstract_Factory1(DataStore_1 d) {
        this.d = d;
    }
    public StorePrice1 getStorePrice() {
        return new StorePrice1(d);
    }
    public ZeroCF1 getZeroCF() {
        return new ZeroCF1(d);
    }
    public IncreaseCF1 getIncreaseCF() {
        return new IncreaseCF1(d);
    }
    public ReturnCoins1 getReturnCoins() {
        return new ReturnCoins1(d);
    }
    public DisposeDrink1 getDisposeDrink() {
        return new DisposeDrink1();
    }
    public DisposeAdditive1 getDisposeAdditive() {
        return new DisposeAdditive1();
    }
    public DataStore getDataStore() {
        return d; 
    }
}