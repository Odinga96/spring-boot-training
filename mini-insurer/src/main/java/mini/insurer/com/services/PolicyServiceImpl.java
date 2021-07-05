package mini.insurer.com.services;

import lombok.RequiredArgsConstructor;
import mini.insurer.com.model.Policy;
import mini.insurer.com.repository.PolicyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 7/5/21, Mon
 */

@Service
@RequiredArgsConstructor
 class PolicyServiceImpl implements PolicyService{

    private final PolicyRepository repository;

    @Override
    public Policy addPolicy(Policy policy) {
        return repository.save(policy);
    }

    @Override
    public List<Policy> getPolicies() {
        return (List<Policy>) repository.findAll();
    }
}
