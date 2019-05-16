// strategy pattern
package strategyPattern;

import mdaModel.DataStore_1;

public class ZeroCF1 extends ZeroCF {
    DataStore_1 d;

    public ZeroCF1(DataStore_1 d) {
        this.d = d;
    }

    @Override
    public void ZeroCF() {
        d.setCf(0);
        System.out.println("  Balance : "+d.getCf());
    }
}
