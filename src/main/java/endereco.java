import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class endereco {
    public cep getCep (String numero) {
        cep novocep = new cep();
        novocep.setBairro("BLA");
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://viacep.com.br/ws/" + numero + "/json/")).build();
            HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            novocep = mapper.readValue(response.body(), cep.class);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return novocep;
    }
}
