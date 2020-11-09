package com.example.algamoney.api;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.example.algamoney.api.config.property.AlgamoneyApiProperty;



@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApiProperty.class)
public class AlgamoneyApiApplication {
	
	private static ApplicationContext APPLICATION_CONTEXT;

	public static void main(String[] args) {
		
		
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		
		APPLICATION_CONTEXT = SpringApplication.run(AlgamoneyApiApplication.class, args);
	}
	
	// Método criado para instanciar um objeto, por exemplo quando o objeto a ser criado
	// pertence a outro Framework, por exemplo, Hibernate. Ver classe LancamentoAnexoListener
	// Nesse caso a anotação @Autowired não funciona, solução foi criar esse método:
	public static <T> T getBean(Class<T> type) {
		return APPLICATION_CONTEXT.getBean(type);
	}
	

}
