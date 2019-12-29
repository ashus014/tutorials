------------------------VIP CLASS-----------------------------

package com.company;

public class VIPCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VIPCustomer(String name, int creditLimit) {
        this(name,creditLimit,"unknown@email.com");
    }

    public VIPCustomer(){
        this("deafaultName",50000,"ashu@abc.com");
    }



    public VIPCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}


----------------------------------MAIN CLASS-----------------------------
package com.company;

public class Main {

    public static void main(String[] args) {
	    VIPCustomer ashuCustomer = new VIPCustomer();

	    System.out.println("Name is " + ashuCustomer.getName() + " Credit Limit is " + ashuCustomer.getCreditLimit()
        + " Email is " + ashuCustomer.getEmailAddress());

	    VIPCustomer akash = new VIPCustomer("Akash",100000,"akash@123.com");

        System.out.println("Name is " + akash.getName() + " Credit Limit is " + akash.getCreditLimit()
                + " Email is " + akash.getEmailAddress());

        VIPCustomer aadi = new VIPCustomer("Aadi",100000);

        System.out.println("Name is " + aadi.getName() + " Credit Limit is " + aadi.getCreditLimit()
                + " Email is " + aadi.getEmailAddress());


    }
}
