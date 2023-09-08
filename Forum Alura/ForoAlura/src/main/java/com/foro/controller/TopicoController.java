package com.foro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.foro.ClasesTopicos.DatosRegistroTopico;
import com.foro.ClasesTopicos.Topico;
import com.foro.ClasesTopicos.TopicoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topico")
public class TopicoController {

	@Autowired
	private TopicoRepository repositorio;

	@PostMapping
	public void RegistroTopico(@RequestBody @Valid DatosRegistroTopico registro) {
		repositorio.save(new Topico(registro));

	}
	
	@GetMapping
	public String helloWorld() {
		return "Hello world xx";
	}

}
