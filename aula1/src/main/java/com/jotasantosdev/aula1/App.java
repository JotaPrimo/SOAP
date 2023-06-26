package com.jotasantosdev.aula1;

import com.jotasantosdev.aula1.servico.CertidaoDeNascimento;
import com.jotasantosdev.aula1.servico.CertidaoNascimentoImpl;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// FAZENDO A PUBLICAOÇÃO DO SERVIÇO
    	CertidaoDeNascimento certidaoDeNascimento = new CertidaoNascimentoImpl();
    	Endpoint.publish("http://localhost:8085/servico/certidao", certidaoDeNascimento);
    	System.out.println("Serviço publicado com sucesso");
    }
    
    
}
