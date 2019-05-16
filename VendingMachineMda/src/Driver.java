import mdaModel.VM_1;
import mdaModel.VM_2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vendingMachine;
        System.out.println("        Select Vending-Machine-1" +
                " or Vending-Machine-2");
        System.out.print("\n");
        System.out.println("        1. Vending-Machine-1");
        System.out.println("        2. Vending-Machine-2");
        System.out.print("\n");
        System.out.println("Select Vending-Machine:");
        vendingMachine = sc.next();
        while(!vendingMachine.equals("1") &&
                !vendingMachine.equals("2") &&
                !vendingMachine.equals("q")) {
            System.out.print("\n");
            System.out.println("        1. Vending-Machine-1");
            System.out.println("        2. Vending-Machine-2");
            System.out.print("\n");
            System.out.println("Select Vending-Machine:");
            vendingMachine = sc.next();
        }

        if (vendingMachine.equals("1")) {

            VM_1 vm1 = new VM_1();
            int p;
            int v;
            int n;
            float x;

            System.out.print("          Vending Machine-1");
            System.out.print("\n");
            System.out.print("          MENU of Operations");
            System.out.print("\n");
            System.out.print("          0.  create(int)");
            System.out.print("\n");
            System.out.print("          1.  coin(int)");
            System.out.print("\n");
            System.out.print("          2.  sugar()");
            System.out.print("\n");
            System.out.print("          3.  tea()");
            System.out.print("\n");
            System.out.print("          4.  chocolate()");
            System.out.print("\n");
            System.out.print("          5.  insert_cups(int)");
            System.out.print("\n");
            System.out.print("          6.  set_price(int)");
            System.out.print("\n");
            System.out.print("          7.  cancel()");
            System.out.print("\n");
            System.out.print("          8.  card(float)");
            System.out.print("\n");
            System.out.print("          q.  Quit the demo program");
            System.out.print("\n");
            System.out.print("   Please make a note of these operations");
            System.out.print("\n");
            System.out.print("          Vending Machine-1 Execution");
            System.out.print("\n");

            Character ch = new Character('1');

            while (ch != 'q') {
                System.out.print("  Select Operation: ");
                System.out.print("\n");
                System.out.print("0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card");
                System.out.print("\n");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '0':  //create
                        System.out.print("  Operation:  create(int p)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter p:");
                        System.out.print("\n");
                        p = sc.nextInt();
                        vm1.create(p);
                        break;
                    case '1':   //coin
                        System.out.print("  Operation: coin(int v)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter v: ");
                        System.out.print("\n");
                        v = sc.nextInt();
                        vm1.coin(v);
                        break;
                    case '2':    //sugar
                        System.out.print("  Operation:  sugar()");
                        System.out.print("\n");
                        vm1.sugar();
                        break;
                    case '3': // tea
                        System.out.print("  Operation:  tea()");
                        System.out.print("\n");
                        vm1.tea();
                        break;
                    case '4':
                        System.out.print("  Operation:  chocolate()");
                        System.out.print("\n");
                        vm1.chocolate();
                        break;
                    case '5': // insert_cups
                        System.out.print("  Operation:  insert_cups(int n)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter n:");
                        System.out.print("\n");
                        n = sc.nextInt();
                        vm1.insert_cups(n);
                        break;
                    case '6':  // set_price
                        System.out.print("  Operation:  set_price(int p)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter p:");
                        System.out.print("\n");
                        p = sc.nextInt();
                        vm1.set_price(p);
                        break;
                    case '7': // cancel
                        System.out.print("  Operation:  cancel()");
                        System.out.print("\n");
                        vm1.cancel();
                        break;
                    case '8':
                        System.out.print("  Operation:  card(float x)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter x:");
                        System.out.print("\n");
                        x = sc.nextFloat();
                        vm1.card(x);
                        break;
                    case 'q':
                        break;
                    default:
                        System.out.print("  Invalid input");
                }
                ;  // endswitch
            }
            ;  //endwhile
        } else if (vendingMachine.equals("2")) {
            VM_2 vm2 = new VM_2();
            float p;
            float v;
            int n;

            System.out.print("          Vending Machine-2");
            System.out.print("\n");
            System.out.print("          MENU of Operations");
            System.out.print("\n");
            System.out.print("          0.  CREATE(float)");
            System.out.print("\n");
            System.out.print("          1.  COIN(float)");
            System.out.print("\n");
            System.out.print("          2.  SUGAR()");
            System.out.print("\n");
            System.out.print("          3.  CREAM()");
            System.out.print("\n");
            System.out.print("          4.  COFFEE()");
            System.out.print("\n");
            System.out.print("          5.  InsertCups(int)");
            System.out.print("\n");
            System.out.print("          6.  SetPrice(float)");
            System.out.print("\n");
            System.out.print("          7.  CANCEL()");
            System.out.print("\n");
            System.out.print("          q.  Quit the demo program");
            System.out.print("\n");
            System.out.print("   Please make a note of these operations");
            System.out.print("\n");
            System.out.print("          Vending Machine-2 Execution");
            System.out.print("\n");

            Character ch = new Character('1');

            while (ch != 'q') {
                System.out.print("  Select Operation: ");
                System.out.print("\n");
                System.out.print("0-CREATE,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-InsertCups,6-SetPrice,7-CANCEL");
                System.out.print("\n");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '0':  //create
                        System.out.print("  Operation:  CREATE(float p)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter p:");
                        System.out.print("\n");
                        p = sc.nextFloat();
                        vm2.CREATE(p);
                        break;
                    case '1':   //coin
                        System.out.print("  Operation: COIN(float v)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter v: ");
                        System.out.print("\n");
                        v = sc.nextFloat();
                        vm2.COIN(v);
                        break;
                    case '2':    //sugar
                        System.out.print("  Operation:  SUGAR()");
                        System.out.print("\n");
                        vm2.SUGAR();
                        break;
                    case '3': // cream
                        System.out.print("  Operation:  CREAM()");
                        System.out.print("\n");
                        vm2.CREAM();
                        break;
                    case '4': // coffee
                        System.out.print("  Operation:  COFFEE()");
                        System.out.print("\n");
                        vm2.COFFEE();
                        break;
                    case '5': // insertCups
                        System.out.print("  Operation:  InsertCups(int n)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter n:");
                        System.out.print("\n");
                        n = sc.nextInt();
                        vm2.InsertCups(n);
                        break;
                    case '6':  // setPrice
                        System.out.print("  Operation:  SetPrice(float p)");
                        System.out.print("\n");
                        System.out.print("  Enter value of parameter p:");
                        System.out.print("\n");
                        p = sc.nextFloat();
                        vm2.SetPrice(p);
                        break;
                    case '7': // cancel
                        System.out.print("  Operation:  CANCEL()");
                        System.out.print("\n");
                        vm2.CANCEL();
                        break;
                    case 'q':
                        break;
                    default:
                        System.out.print("  Invalid input");
                }
                  // endswitch
            }
              //endwhile
        }
    }
 }
