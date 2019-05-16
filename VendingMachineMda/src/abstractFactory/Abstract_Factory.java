//abstract factory pattern
package abstractFactory;


import strategyPattern.*;
import mdaModel.DataStore;

public abstract class Abstract_Factory {
    public abstract StorePrice getStorePrice(); // abstract operation
    public abstract ZeroCF getZeroCF();     // abstract operation
    public abstract IncreaseCF getIncreaseCF();   // abstract operation
    public abstract ReturnCoins getReturnCoins();   // abstract operation
    public abstract DisposeDrink getDisposeDrink();   // abstract operation
    public abstract DisposeAdditive getDisposeAdditive();  // abstract operation
    public abstract DataStore getDataStore();   // abstract operation
}