package Singleton;

import javax.sound.midi.Soundbank;

public class Client extends Browser{
    public static void main(String[] args) {
        Client c1 = new Client();
        System.out.println( c1.makeRequest());
        Client c2 = new Client();
        System.out.println(c2.makeRequest());
    }

}
