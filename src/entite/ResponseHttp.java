package entite;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ResponseHttp {

	protected HttpResponse<String> responseHttp;

	public ResponseHttp() {
		super();
	}
	
	public ResponseHttp(HttpResponse<String> responseHttp) {
		super();
		this.responseHttp = responseHttp;
	}


	public void setResponseHttp(HttpResponse<String> responseHttp) {
		this.responseHttp = responseHttp;
	}

	public HttpResponse<String> respHttp(String namesite) throws URISyntaxException, IOException, InterruptedException {
		
		System.out.println("1 "+namesite);
		HttpClient clientHttp = HttpClient.newHttpClient();
		
		HttpRequest requestHttp = HttpRequest.newBuilder()
				.GET()
				.uri(new URI(namesite))
				.build();
	
		responseHttp =   clientHttp.send(requestHttp,HttpResponse.BodyHandlers.ofString());
	//	.thenApply(a -> a.version())
	//	.thenAccept(b -> System.out.println(b));
		
		System.out.printf("valor de retorno: %d\n",(int)responseHttp.statusCode());
		return responseHttp;
	}
	

}
