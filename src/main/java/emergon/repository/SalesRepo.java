package emergon.repository;

import emergon.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepo extends JpaRepository<Sales,Integer>{
    
}
