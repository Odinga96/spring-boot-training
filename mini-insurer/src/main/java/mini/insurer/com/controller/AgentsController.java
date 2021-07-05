package mini.insurer.com.controller;

import lombok.RequiredArgsConstructor;
import mini.insurer.com.model.Agents;
import mini.insurer.com.services.AgentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Odinga David
 * @since : 7/3/21, Sat
 */

@RestController
@RequestMapping("/agents")
@RequiredArgsConstructor
public class AgentsController {

    private final AgentService agentsService;

    //Add client
    @PostMapping
    public ResponseEntity<Agents> addAgents(@RequestBody Agents agents){
        Agents agent = agentsService.addAgents(agents);

        return  new ResponseEntity<>(agent, HttpStatus.CREATED);
    }

    //View agents
    @GetMapping
    public ResponseEntity<Page<Agents>> agents(@RequestParam int page, @RequestParam int size){

        PageRequest request = PageRequest.of(page, size);

        List<Agents> agents = agentsService
                .agents(request)
                .getContent()
                .stream()
                .filter(agents1 -> agents1.getCommission() >= 100 && agents1.getName().equalsIgnoreCase("Mike"))
                .collect(Collectors.toList());

        return ResponseEntity.ok(agentsService.agents(request));
    }

    //View specific client
    @GetMapping("/{clientCode}")
    public ResponseEntity<Agents> viewAgents(@PathVariable Long clientCode){
        return ResponseEntity.ok(agentsService.getAgents(clientCode));
    }

    //update client
    @PutMapping
    public ResponseEntity<Agents> updateAgents(@RequestBody Agents client){
        return ResponseEntity.ok(agentsService.updateAgents(client));
    }

    //Delete client
    @DeleteMapping
    public ResponseEntity<Agents> deleteAgents(@RequestParam Long clientCode){
        return ResponseEntity.ok(agentsService.deleteAgents(clientCode));
    }
}
