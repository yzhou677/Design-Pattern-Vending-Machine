// strategy pattern
package strategyPattern;

import java.util.ArrayList;

public class DisposeAdditive2 extends DisposeAdditive {
    @Override
    public void DisposeAdditive(ArrayList a) {
        if (a != null) {
            for (int i = 0; i< a.size(); i++) {
                if (a.get(i).equals(1)) {
                    System.out.println("  Adding cream");
                } else if (a.get(i).equals(2)) {
                    System.out.println("  Adding sugar");
                }
            }
        }

    }
}
