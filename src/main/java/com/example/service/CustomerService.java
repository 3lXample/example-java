package com.example.service;

import java.util.List;
import java.util.UUID;
import com.example.model.CustomerWatch;

public interface CustomerService {
  List<CustomerWatch> findAllWatching(UUID customerId);
}
