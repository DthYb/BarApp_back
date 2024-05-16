package com.example.barapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.barapp.api.model.Client;

@Service
public class ClientService {
    
    private List<Client> clientList;

    public ClientService() {
        clientList = new ArrayList<>();

        Client client1 = new Client(1,1);

        clientList.add(client1);
    }
    public Optional<Client> getClient(Integer id) {
        Optional optional = Optional.empty();
        for(Client client : clientList){
            if(id==client.getId()){
                optional = Optional.of(client);
                return optional;
            }
        }
        return optional;
    }
}
