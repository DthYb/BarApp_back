package com.example.barapp.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.barapp.api.model.Client;
import com.example.barapp.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ClientController {
    
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client")
    public Client getClient(@RequestParam Integer id) {
        Optional<Client> client = clientService.getClient(id);
        if(client.isPresent()){
            return(Client) client.get();
        }
        return null;
    }
    
}
