package moon.springframework.sfgpetclinic.services;

import moon.springframework.sfgpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService {

	public Owner findByLastName(String lastName);

	public Owner findById(Long id);

	public Owner save(Owner owner);

	public Set<Owner> findAll();

}
