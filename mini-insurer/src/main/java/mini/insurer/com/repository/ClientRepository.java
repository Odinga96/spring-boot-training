package mini.insurer.com.repository;

import mini.insurer.com.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Odinga David
 * @since : 7/1/21, Thu
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
