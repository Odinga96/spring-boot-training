package mini.insurer.com.services;

import mini.insurer.com.model.Policy;

import java.util.List;

/**
 * @author : Odinga David
 * @since : 7/5/21, Mon
 */
public interface PolicyService {

    Policy addPolicy(Policy agents);

    List<Policy> getPolicies();
}
