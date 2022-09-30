package com.example.demo.bsm.controler;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping ("/bsm")
	public class Bsmcontroller {			
		@GetMapping 
		public String bsm() {
			return "BSM's da Generation Brasil !\n\tMentalidades: \n1-Orientação ao detalhe.\n2-Responsabilidade Pessoal.\n3-Mentalidade de crescimento.\n4-Persistência.\n\tHabilidades: \n1-Trabalho em equipe.\n2-Atenção aos detalhes.\n3-Proatividade.\n4-Comunicação.";
		}
	}
