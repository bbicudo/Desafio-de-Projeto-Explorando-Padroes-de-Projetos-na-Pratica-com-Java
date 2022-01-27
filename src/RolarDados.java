import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.json.JSONArray;
import org.json.JSONObject;

public class RolarDados {
	
	//Utiliza Http para acessar API de rolagem de dados, que retorna o resultado em JSON
	//Foi utilizada a biblioteca "Json-Java" para realizar parse dos resultados
	
	private static final String URL_GET = "http://roll.diceapi.com/json/"; 
	
	private HttpClient cliente = HttpClient.newHttpClient();
	
	private RolarDados() {
		super();
	}

	public static RolarDados instancia = new RolarDados();
	
	public static RolarDados getInstancia() {
		return instancia;
	}

	public int rolarDado(int qtd, int dado) throws IOException, InterruptedException{
	
		int resultado = 0;
		
		//Cria o Request
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET + qtd + "d" + dado))
				.build();
		
		//Envia a solicitação
		HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
		
		String retorno = response.body();
		JSONObject json = new JSONObject(retorno);
		JSONArray parseJson = json.getJSONArray("dice");
		
		for (int i = 0; i < parseJson.length(); i++) {
            resultado = parseJson.getJSONObject(i).getInt("value");
            return resultado;
        }
		
		return resultado;
	
	}
}
	

