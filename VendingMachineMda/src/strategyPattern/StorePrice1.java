// strategy pattern
package strategyPattern;

import mdaModel.DataStore_1;

public class StorePrice1 extends StorePrice {
    DataStore_1 dataStore_1;

    public StorePrice1(DataStore_1 dataStore_1) {
        this.dataStore_1 = dataStore_1;
    }

    @Override
    public void StorePrice() {
        dataStore_1.setPrice(dataStore_1.getTempP());
        dataStore_1.setTempP(0);
        System.out.println("  Set price to " + dataStore_1.getPrice());
    }
}
