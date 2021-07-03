package mini.insurer.com.repository;

import mini.insurer.com.model.Agents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 7/3/21, Sat
 */
public interface AgentRepository  extends JpaRepository<Agents, Long> {


//    fetch agents using name
    List<Agents> findAllByNameIsLike(String name);

//    fetch agent using email
    Agents findFirstByEmailEquals(String email);

//    fetch agents using commission
    List<Agents> findAllByCommissionGreaterThan(long commission);

    List<Agents> findAllByCommissionLessThanEqual(long commission);

//    @Query("select * from Agent a where a ")
//    List<Agents> filteredAgents();
}
