package com.ma.service_voiture.services;

import com.ma.service_voiture.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService {

    @GetMapping("/client/{id}")
    Client clientById(@PathVariable Long id);
}