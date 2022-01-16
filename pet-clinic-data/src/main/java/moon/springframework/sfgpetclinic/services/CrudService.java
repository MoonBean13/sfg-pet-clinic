package moon.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

	public Set<T> findAll();
	
	public T findById(ID id);
	
	public T save(T object);
	
	public void delte(T object);
	
	public void deleteById(ID id);
	
}
