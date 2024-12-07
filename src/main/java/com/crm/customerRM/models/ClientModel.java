package com.crm.customerRM.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.customerRM.repositories.ClientRepository;



@Service
public class ClientModel {


    @Autowired
    private ClientRepository clientRepo;


    public List<com.crm.customerRM.entities.Client> Display_Clients(){
        return clientRepo.findAll();
    }
    
}
