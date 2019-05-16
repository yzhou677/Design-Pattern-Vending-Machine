// strategy pattern
package strategyPattern;

import mdaModel.DataStore_2;

public class ReturnCoins2 extends ReturnCoins {
    private DataStore_2 dataStore_2;

    public ReturnCoins2(DataStore_2 dataStore_2) {
        this.dataStore_2 = dataStore_2;
    }

    @Override
    public void ReturnCoins(int c) {
        if (c == 0) {
            System.out.println("  Return "+ dataStore_2.getTempV() + " coins");
            dataStore_2.setTempV(0);
        } else if (c == 1) {
            System.out.println("  Return " + dataStore_2.getCf() + " coins");
        }
    }
}
