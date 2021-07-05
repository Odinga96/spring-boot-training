package mini.insurer.com.services;

import mini.insurer.com.model.Agents;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 7/3/21, Sat
 */
public interface AgentService {

    //Add agents
    Agents addAgents(Agents agents);

    List<Agents> addAgents(List<Agents> agents);

    //View agents
    Page<Agents> agents(PageRequest request);

    //View specific agents
    Agents getAgents(Long agentsCode);

    //update agents
    Agents updateAgents(Agents agents);

    //Delete agents
    Agents deleteAgents(Long agentsCode);



    List<Agents> getAgents(String name);

    Agents getAgentsWithEmail(String email);

    List<Agents> getAgentsWithCommissionHigher(long commission);

    List<Agents> getAgentsWithCommissionLower(long commission);
}
