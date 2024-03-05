package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pet;
import com.example.demo.service.PetService;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private PetService pts;

	@GetMapping("/all")
	public ResponseEntity<List<Pet>> getAllPets() {
		List<Pet> pets = pts.getAll();
		return new ResponseEntity<>(pets, HttpStatus.OK);
	}

	@PostMapping("/added")
	public ResponseEntity<Pet> addPet(@ModelAttribute Pet pet) {
		Pet addedPet = pts.addPet(pet);
		return new ResponseEntity<>(addedPet, HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Pet> updatePet(@PathVariable int id, @RequestBody Pet petDetails) {
		Pet updatedPet = pts.update(id, petDetails);
		return updatedPet != null ? ResponseEntity.ok(updatedPet) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/deleted/{id}")
	public ResponseEntity<Pet> deletePet(@PathVariable int id) {
		pts.delete(id);
		return ResponseEntity.noContent().build();
	}
}
