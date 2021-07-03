package mini.insurer.com.controller;

import mini.insurer.com.model.Client;
import mini.insurer.com.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 7/1/21, Thu
 */

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;


    //Add client
    @PostMapping
    public Client addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    //View clients
    @GetMapping
    public List<Client> clients(){
        return clientService.clients();
    }

    //View specific client
    @GetMapping("/{clientCode}")
    public Client viewClient(@PathVariable Long clientCode){
        return clientService.getClient(clientCode);
    }

    //update client
    @PutMapping
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    //Delete client
    @DeleteMapping
    public Client deleteClient(@RequestParam Long clientCode){
        return clientService.deleteClient(clientCode);
    }
}
