package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;

@Service
public class PetService {

	List<Pet> list;

	@Autowired
	private PetRepository repo;

	public List<Pet> getAll() {
		return repo.findAll();
	}

	public Pet addPet(Pet pet) {
		return repo.save(pet);
	}
	
	public Pet update(long id , Pet petDetails) {
		Optional<Pet> optionalPet = repo.findById(id);
		
		if(optionalPet.isPresent()) {
			Pet pet = optionalPet.get();
			pet.setName(petDetails.getName());
			pet.setAge(petDetails.getAge());
			pet.setBreed(petDetails.getBreed());
			pet.setDescription(petDetails.getDescription());
			
			return repo.save(pet);
		}else {
			System.out.println("Entered Pet Details not found");
			return null;
		}	
	}
	
	public String delete(long id) {
		repo.deleteById(id);
		return "Deleted id" + id + " Successfully";
	}

}
