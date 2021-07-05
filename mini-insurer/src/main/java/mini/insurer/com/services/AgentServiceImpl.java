package mini.insurer.com.services;

import lombok.RequiredArgsConstructor;
import mini.insurer.com.model.Agents;
import mini.insurer.com.repository.AgentRepository;
import mini.insurer.com.repository.ClientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * @author : Odinga David
 * @since : 7/3/21, Sat
 */
@Service
@RequiredArgsConstructor
 public class AgentServiceImpl implements AgentService{

    private final AgentRepository repository;

    @Override
    public Agents addAgents(Agents agents) {
        return repository.save(agents);
    }

    @Override
    public List<Agents> addAgents(List<Agents> agents) {
        return repository.saveAll(agents);
    }

    @Override
    public Page<Agents> agents(PageRequest request) {
        return repository.
                findAll(request);
    }

    @Override
    public Agents getAgents(Long agentsCode) {
        Optional<Agents> agents = repository.findById(agentsCode);

        return agents.orElse(null);
    }

    @Override
    public Agents updateAgents(Agents agents) {
        return repository.save(agents);
    }

    @Override
    public Agents deleteAgents(Long agentsCode) {
        Agents agent = getAgents(agentsCode);

        if (agent != null)
            repository.delete(agent);

        return agent;
    }

    @Override
    public List<Agents> getAgents(String name) {
        return repository.findAllByNameIsLike(name);
    }

    @Override
    public Agents getAgentsWithEmail(String email) {
        return repository.findFirstByEmailEquals(email);
    }

    @Override
    public List<Agents> getAgentsWithCommissionHigher(long commission) {
        return repository.findAllByCommissionGreaterThan(commission);
    }

    @Override
    public List<Agents> getAgentsWithCommissionLower(long commission) {
        return repository.findAllByCommissionLessThanEqual(commission);
    }
}
