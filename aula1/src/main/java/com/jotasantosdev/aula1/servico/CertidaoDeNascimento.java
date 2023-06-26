package com.jotasantosdev.aula1.servico;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

//SEi Service Endpoint Interface
@WebService // indica que é uma interface de serviço
@SOAPBinding (style = Style.RPC) // indica que vamos trabalhar apenas com dados primitivos
public interface CertidaoDeNascimento {
	
	@WebMethod // indica que é uma operação do serviço
	public int calcularIdade(String idade);
	
	@WebMethod // indica que é uma operação do serviço
	public String diaSemanaNascimento(String idade);
	
	

}
