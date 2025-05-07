import vinicola.VinicolaServerImpl;
import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Web Service stá no ar!");
        Endpoint.publish("http://127.0.0.1:9876/vinicola", new VinicolaServerImpl());
    }}