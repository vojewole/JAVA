package com.victor.dojos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.victor.dojos.models.Ninja;
import com.victor.dojos.repositories.NinjaRepository;


@Service
public class NinjaService {
	
private final NinjaRepository ninjaRepository;
    
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    // returns all the ninjas
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    // creates a ninja
    public Ninja createNinja(Ninja d) {
        return ninjaRepository.save(d);
    }
    // retrieves a ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    
    
    public Ninja updateNinja(Ninja d) 
    
    {
    	return ninjaRepository.save(d);
    }
    
    public void deleteninja(Long id) {
    	ninjaRepository.deleteById(id);
    }

}
