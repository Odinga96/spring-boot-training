package mini.insurer.com.repository;

import mini.insurer.com.model.Policy;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

/**
 * @author : Odinga David
 * @since : 7/5/21, Mon
 */
public interface PolicyRepository extends CrudRepository<Policy, BigDecimal> {
}
