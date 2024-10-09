package holdingsPackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoldingInterface extends JpaRepository <Holdings, Integer>{

}
