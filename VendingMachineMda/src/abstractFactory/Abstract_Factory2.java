//abstract factory pattern
package abstractFactory;

import mdaModel.DataStore;
import mdaModel.DataStore_2;
import strategyPattern.*;

public class Abstract_Factory2 extends Abstract_Factory {
    private DataStore_2 d;
    public Abstract_Factory2(DataStore_2 d) {
        this.d = d;
    }
    public StorePrice2 getStorePrice() {
        return new StorePrice2(d);
    }
    
    public ZeroCF2 getZeroCF() {
        return new ZeroCF2(d);
    }
    
    public IncreaseCF2 getIncreaseCF() {
        return new IncreaseCF2(d);
    }
    
    public ReturnCoins2 getReturnCoins() {
        return new ReturnCoins2(d);
    }
    public DisposeDrink2 getDisposeDrink() {
        return new DisposeDrink2();
    }
    
    public DisposeAdditive2 getDisposeAdditive() {
        return new DisposeAdditive2();
    }
    
    public DataStore getDataStore() {
        return d; 
    }
}