package vinicola;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class VinicolaClient {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://127.0.0.1:9876/vinicolawsdL");
        QName qName = new QName("http://vinicola/", "VinicolaServerImpl");
        Service ws = Service.create(url, qName);
        VinicolaServer vinicolaServer = ws.getPort(VinicolaServer.class);
        System.out.println("Produto cadastrado: " + vinicolaServer.cadastrarVinho(1L, "Vinho Teste", 70.00F));
        System.out.println("Produto Pesquisado: " + vinicolaServer.pesquisarPreco(("Vinho1")));
    }
}