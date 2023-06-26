package com.jotasantosdev.aula2;


import java.net.URL;
import javax.xml.namespace.QName;

import com.jotasantosdev.aula2.servico.CertidaoDeNascimento;

import jakarta.xml.ws.Service;


public class App 
{
    public static void main( String[] args ) throws Exception    
    {
    	// caminho do wsdl onde vamos consumir o serviço
    	URL url = new URL("http://localhost:8085/servico/certidao?wsdl");
  	  
    	// tagert namespace do serviço e nome do serviço, estão do wsdl, na primeira tag definitions
        QName qname = new QName("http://servico.aula1.jotasantosdev.com/", "CertidaoNascimentoImplService");
  
        Service service = Service.create(url, qname);
  
        // nome da interface criada para disponilizar o serviço, criando obj proxy, para acionar os metodos
        CertidaoDeNascimento certidao = service.getPort(CertidaoDeNascimento.class);
        int idade = certidao.calcularIdade("20/10/1981");
        String diaSemana = certidao.diaSemanaNascimento("20/10/1981");  // parametro que o metodo exige      
        System.out.println("Idade: " + idade);
        System.out.println("Dia da semana: " + diaSemana);

    }
    
    
    
}
