// strategy pattern
package strategyPattern;

import mdaModel.DataStore_2;

public class ZeroCF2 extends ZeroCF {
    DataStore_2 dataStore_2;

    public ZeroCF2(DataStore_2 dataStore_2) {
        this.dataStore_2 = dataStore_2;
    }

    @Override
    public void ZeroCF() {
        dataStore_2.setCf(0);
        System.out.println("  Balance : "+ dataStore_2.getCf());
    }
}
