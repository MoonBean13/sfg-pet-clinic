package moon.springframework.sfgpetclinic.services.map;

import java.util.Set;

import moon.springframework.sfgpetclinic.model.Pet;
import moon.springframework.sfgpetclinic.services.CrudService;

public class PetServiceMap extends AbstracMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}