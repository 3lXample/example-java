package com.example.service;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.CustomerWatch;
import com.example.repository.CustomerWatchRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
  @Autowired
  private CustomerWatchRepository customerWatchRepository;

  @Override
  public List<CustomerWatch> findAllWatching(UUID customerId) {
    return customerWatchRepository.findByCustomerIdOrderByUpdatedDateDesc(customerId);
  }
}
