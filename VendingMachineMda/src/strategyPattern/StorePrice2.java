// strategy pattern
package strategyPattern;

import mdaModel.DataStore_2;

public class StorePrice2 extends StorePrice {
    DataStore_2 dataStore_2;

    public StorePrice2(DataStore_2 dataStore_2) {
        this.dataStore_2 = dataStore_2;
    }

    @Override
    public void StorePrice() {
        dataStore_2.setPrice(dataStore_2.getTempP());
        dataStore_2.setTempP(0);
        System.out.println("  Set price to " + dataStore_2.getPrice());
    }
}
