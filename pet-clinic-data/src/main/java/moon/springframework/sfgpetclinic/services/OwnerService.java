package moon.springframework.sfgpetclinic.services;

import moon.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	public Owner findByLastName(String lastName);

}
