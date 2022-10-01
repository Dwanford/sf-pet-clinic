package dwanford.springframework.sfpetclinic.bootstrap;

import dwanford.springframework.sfpetclinic.services.OwnerService;
import dwanford.springframework.sfpetclinic.services.VetService;
import dwanford.springframework.sfpetclinic.services.map.OwnerServiceMap;
import dwanford.springframework.sfpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {



    }
}
