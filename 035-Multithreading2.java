    package com.company;


    class Hi implements Runnable{
        public void run(){
            for (int i=1;i<5;i++){
                System.out.println("Hi");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){

                }
            }
        }
    }

    class Hello implements Runnable{
        public void run(){
            for (int i=1;i<5;i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){

                }
            }
        }
    }

    public class Main {

        public static void main(String[] args) throws Exception{
            Runnable obj1 = new Hi();
            Runnable obj2 = new Hello();

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);


            t1.setName("Hi Thread");
            t2.setName("Hello Thread");
            System.out.println(t1.getName());
            System.out.println(t2.getName());

            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());

            

            t1.start();
            try{
                Thread.sleep(10);
            }catch(Exception e ){

            }
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Bye");

        }
    }
