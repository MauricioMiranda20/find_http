package entite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;



public class LerArquivo extends ResponseHttp{
	
	private String nameq;
	private String namearq;

	public LerArquivo() {
		super();
	}

	public LerArquivo(String nameq, String namearq) {
		super();
		this.nameq = nameq;
		this.namearq = namearq;
	}

	public String getNameq() {
		return nameq;
	}

	public void setNameq(String nameq) {
		this.nameq = nameq;
	}

	public String getNamearq() {
		return namearq;
	}

	public void setNamearq(String namearq) {
		this.namearq = namearq;
	}

	public void imprimitvalor() throws URISyntaxException, InterruptedException{
		String ser = " " ;
		File arquivo = new File(nameq);

        /* Verifica se o arquivo existe e se é um arquivo*/
	    if (arquivo.exists() && arquivo.isFile()) {
	            /*Usa BufferedReader para ler o arquivo*/
	    	try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
	                String linha;
	                while ((linha = br.readLine()) != null) {
	                	ser = namearq+linha;
	                    System.out.println("linha "+ser +" ");
	                    respHttp(ser);//classe ResponseHttp
	                    System.out.println();
	                }
	       }
	       catch (IOException e) {
	    	   e.printStackTrace();
	       }
	    } else {
			System.out.println("O arquivo não existe ou não é um arquivo válido.");
		}
	}



}
