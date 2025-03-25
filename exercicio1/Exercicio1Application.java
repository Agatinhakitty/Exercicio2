package br.edu.ifpr.foz.exercicio1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
@RequestMapping("")
public class Exercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}
	
    @GetMapping("/requisicao")
    @ResponseBody
    public String getRequest(HttpServletRequest request){
       String requisicao = request.getMethod() + "  " + request.getRequestURI() + "  " + request.getProtocol();

       return requisicao;
    }

}