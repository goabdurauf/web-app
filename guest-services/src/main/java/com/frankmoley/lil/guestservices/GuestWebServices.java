package com.frankmoley.lil.guestservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/guests")
public class GuestWebServices {

    private final GuestRepository guestRepository;

    @Autowired
    public GuestWebServices(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping
    public Iterable<Guest> getAllGuests(){
        return guestRepository.findAll();
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable("id") long id){
        RestTemplate restTemplate = new RestTemplate();

        return this.guestRepository.findById(id).get();
    }
}
