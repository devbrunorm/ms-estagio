package br.com.deal.estagio.agosoto.nid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.deal.estagio"})
public class MsEstagioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEstagioApplication.class, args);
	}

}
