package Singleton;

public class Browser {
        private final ServerInterface server;
    Browser()
    {
        server = Server.getServerInstance();
    }
    public  String makeRequest()
    {
       return server.getData();

    }

}


