package com.company;


class Main{
    public static void main(String[] args) {

//        new Thread(new CodeToRun()).start();

        new Thread(()-> System.out.println("Printing from the Runnable")).start();

    }
}

class CodeToRun implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing from Runnable");
    }
}

------------------------------------------------------------------------------------------------
    
 package com.company;


class Main{
    public static void main(String[] args) {

//        new Thread(new CodeToRun()).start();

        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.println("Line 3");
            System.out.println("Line 4");
        }).start();

    }
}
   
