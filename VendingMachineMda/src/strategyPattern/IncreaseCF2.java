// strategy pattern
package strategyPattern;

import mdaModel.DataStore_2;

public class IncreaseCF2 extends IncreaseCF {
    DataStore_2 dataStore_2;
    public  IncreaseCF2(DataStore_2 dataStore_2) {
        this.dataStore_2 = dataStore_2;
    }
    @Override
    public void IncreaseCF() {
        dataStore_2.setCf(dataStore_2.getCf() + dataStore_2.getTempV());
        dataStore_2.setTempV(0);
        System.out.println("  Balance : "+ dataStore_2.getCf());
    }
}
