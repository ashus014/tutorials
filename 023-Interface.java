------------------------ITelephone.java--------------------------


public interface ITelephone{
    
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

}


-----------------------------DeskPhone.java---------------------------

/**
 * DeskPhone
 */
public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskphone.");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }else{
            isRinging = false;
        }

        return false;
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now rining "+ phoneNumber);

    }

    @Override
    public boolean isRinging() {
        
        return isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not has power button");
    }

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }
}


---------------------MobilePhone.java-----------------------
/**
 * MobilePhone
 */
public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn =  false;

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobilePhone.");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging = true;
            System.out.println("Melody PLaying");
        }else{
            isRinging = false;
        }

        return false;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now rining "+ phoneNumber);
        }else{
            System.out.println("Phone is switched Off.");
        }
    }

    @Override
    public boolean isRinging() {
        
        return isRinging;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println(" Mobile phone powered up...");
    }

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }
}

--------------------Main.java----------------------------

public class Main {

    public static void main(String[] args) {
        ITelephone ashuPhone;

        // DeskPhone ashuPhone;    --- This is also valid
        ashuPhone = new DeskPhone(123456);
        ashuPhone.powerOn();
        ashuPhone.callPhone(123456);
        ashuPhone.answer();

        ashuPhone = new MobilePhone(23456);
        ashuPhone.callPhone(23456);
        ashuPhone.answer();

    }
}



