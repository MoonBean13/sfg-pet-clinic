package moon.springframework.sfgpetclinic.bootstrap;

import moon.springframework.sfgpetclinic.model.Owner;
import moon.springframework.sfgpetclinic.model.Vet;
import moon.springframework.sfgpetclinic.services.OwnerService;
import moon.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;

	private final VetService vetService;

	/**
	 * DataLoader constructor
	 * @param ownerService
	 * @param vetService
	 */
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	/**
	 * Override run method from CommandLineRunner
	 * @param args
	 */
	@Override
	public void run(String... args) {

		Owner owner1 = new Owner();
		owner1.setFirstName("Harry");
		owner1.setLastName("Potter");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Hermine");
		owner2.setLastName("Granger");

		ownerService.save(owner2);

		System.out.println("Loaded Owners...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Barbara");
		vet1.setLastName("Zimmermann");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("John");
		vet2.setLastName("Dolittle");

		vetService.save(vet2);

		System.out.println("Loaded Vets...");
	}

}
