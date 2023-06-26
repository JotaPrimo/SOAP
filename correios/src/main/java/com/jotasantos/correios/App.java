package com.jotasantos.correios;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.fourcatsdev.correios.servico.AtendeCliente;
import com.fourcatsdev.correios.servico.EnderecoERP;

import jakarta.xml.ws.Service;



public class App 
{
    public static void main( String[] args ) throws Exception  
    {
	URL urlCooreios = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
	        
	        QName qnameCorreios = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");
	  
	        Service serviceCorreios = Service.create(urlCooreios, qnameCorreios);
	        
	        AtendeCliente correios = serviceCorreios.getPort(AtendeCliente.class);
	        
	        EnderecoERP endereco = correios.consultaCEP("79103400");
	        System.out.println(endereco.getCidade());
	        System.out.println(endereco.getBairro());

    }
    
}
