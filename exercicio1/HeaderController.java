package br.edu.ifpr.foz.exercicio1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class HeaderController {

    @GetMapping("/header/cabecalho")
    @ResponseBody
	public String header(HttpServletRequest request){
        String headers = "Host: " + request.getHeader("Host") + "<br>" + 
                             "User-Agent: " + request.getHeader("User-Agent") + "<br>" + 
                             "Accept-Encoding: " + request.getHeader("Accept-Encoding") + "<br>" +
                             "Accept-Language: " + request.getHeader("Accept-Language");

        return headers;
    }

}