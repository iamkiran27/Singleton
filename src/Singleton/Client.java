package Singleton;



public class Client extends Browser{
    public static void main(String[] args) {
        Client c1 = new Client();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(c1.makeRequest());
            }
        });

//        System.out.println( c1.makeRequest());
        Client c2 = new Client();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(c2.makeRequest());
            }
        });

        Client c3 = new Client();
     
//        System.out.println(c2.makeRequest());
        t1.start();
        t2.start();
     
    }

}
