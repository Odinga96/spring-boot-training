package mini.insurer.com.services;

import mini.insurer.com.model.Client;
import mini.insurer.com.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author : Odinga David
 * @since : 7/1/21, Thu
 */

@Service
class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository repository;

    @Override
    public Client addClient(Client client) {
        return repository.save(client);
    }

    @Override
    public List<Client> clients() {
        return repository.findAll();
    }

    @Override
    public Client getClient(Long clientCode) {
        Optional<Client> client = repository.findById(clientCode);

        return client.orElse(null);
    }

    @Override
    public Client updateClient(Client client) {
        return repository.save(client);
    }

    @Override
    public Client deleteClient(Long clientCode) {
        Client client = getClient(clientCode);

        if (client != null)
            repository.delete(client);

        return client;
    }
}
