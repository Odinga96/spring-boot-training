package mini.insurer.com.services;

import mini.insurer.com.model.Client;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 7/1/21, Thu
 */

public interface ClientService {

    //Add client
    Client addClient(Client client);

    //View clients
    List<Client> clients();

    //View specific client
    Client getClient(Long clientCode);

    //update client
    Client updateClient(Client client);

    //Delete client
    Client deleteClient(Long clientCode);




}
