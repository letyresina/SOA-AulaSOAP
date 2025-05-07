package vinicola;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface VinicolaServer {
    @WebMethod Vinho cadastrarVinho(Long id, String nome, Float preco);
    @WebMethod Vinho pesquisarPreco(String nome);
}
