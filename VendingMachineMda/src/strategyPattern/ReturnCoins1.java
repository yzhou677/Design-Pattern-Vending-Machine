// strategy pattern
package strategyPattern;

import mdaModel.DataStore_1;

public class ReturnCoins1 extends ReturnCoins {
    private DataStore_1 dataStore_1;

    public ReturnCoins1(DataStore_1 dataStore_1) {
        this.dataStore_1 = dataStore_1;
    }

    @Override
    public void ReturnCoins(int c) {
        if (c == 0) {
            System.out.println("  Return "+ dataStore_1.getTempV() + " coins");
            dataStore_1.setTempV(0);
        } else if (c == 1) {
            System.out.println("  Return " + dataStore_1.getCf() + " coins");
        }
    }
}
