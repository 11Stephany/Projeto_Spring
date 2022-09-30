package com.example.demo.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivo")
public class ObjetivoController {	
		
		@GetMapping 
		public String objetivo() {
			return "\tObjetivos de aprendizagem desta semana.\n1-Mentalidades: Persistencia.\n2-Habilidade: Atenção aos detalhes.\n3-Gestão de tempo.\n4-Revisar contéudo de Java.";						
		}
}
