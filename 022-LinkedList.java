import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList
 */

class customer{
    private int balance;

    public customer(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    
}
public class linkedList {

    public static void main(String[] args) {
        customer cust = new customer(34);

        customer anotherCust;
        anotherCust = cust;

        anotherCust.setBalance(54);

        System.out.println("Balance :: " + anotherCust.getBalance());


        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Ashu");
        placesToVisit.add("Akash");
        placesToVisit.add("Anu");

        printList(placesToVisit);

        placesToVisit.add(1,"Muskaan");

        printList(placesToVisit);

        placesToVisit.remove(1);

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("------------------------------------");

    }
}
