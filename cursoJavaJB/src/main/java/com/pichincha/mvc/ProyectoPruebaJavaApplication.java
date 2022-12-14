package com.pichincha.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProyectoPruebaJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPruebaJavaApplication.class, args);
	}
            @Bean
            public void verificarHora(){
                System.out.println("com.pichincha.mvc.ProyectoPruebaJavaApplication.verificarHora()");
            }

}
