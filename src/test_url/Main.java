package test_url;


import java.io.IOException;
import java.net.URISyntaxException;

import entite.LerArquivo;

public class Main {

	public static void main(String[] args) throws URISyntaxException, InterruptedException, IOException {
		
		
        LerArquivo arq = new LerArquivo("C:\\Users\\Users\\Documents\\teste.txt", "https://www.google.com/");
        arq.imprimitvalor();

	}


}
