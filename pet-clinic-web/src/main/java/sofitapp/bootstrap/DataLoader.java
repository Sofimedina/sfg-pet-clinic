package sofitapp.bootstrap;

import sofitapp.model.Owner;
import sofitapp.model.Vet;
import sofitapp.services.OwnerService;
import sofitapp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Sofia");
        owner1.setLastName("Medina");

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Wilson");
        owner2.setLastName("Diaz");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("saving owners");


        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Lorenzo");
        vet1.setLastName("Castro");
        Vet vet2=new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Romina");
        vet2.setLastName("Vega");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("saving vets");

    }
}
