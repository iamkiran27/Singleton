package Singleton;

public class Server implements  ServerInterface {
    private static ApplicationDatabase db =  null;
    private Server(){
         db = ApplicationDatabase.getDatabaseInstance();
    }
    private static Server s = null;
    public  static synchronized  Server getServerInstance()
    {
        if(s == null)
        {
            s = new Server();
            return  s;
        }
        else
        {
            return  s;
        }
    }

    public String getData()
    {
return  db.getData();
    }
}
