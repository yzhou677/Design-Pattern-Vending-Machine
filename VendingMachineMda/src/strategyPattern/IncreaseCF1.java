// strategy pattern
package strategyPattern;

import mdaModel.DataStore_1;

public class IncreaseCF1 extends IncreaseCF {
    DataStore_1 dataStore_1;
    public  IncreaseCF1(DataStore_1 dataStore_1) {
        this.dataStore_1 = dataStore_1;
    }
    @Override
    public void IncreaseCF() {
        dataStore_1.setCf(dataStore_1.getCf() + dataStore_1.getTempV());
        dataStore_1.setTempV(0);
        System.out.println("  Balance : "+ dataStore_1.getCf());
    }
}
