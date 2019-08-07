package com.example.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.model.CustomerWatch;

@Repository
public interface CustomerWatchRepository extends CrudRepository<CustomerWatch, UUID> {

  List<CustomerWatch> findByCustomerIdOrderByUpdatedDateDesc(UUID customerId);
}
