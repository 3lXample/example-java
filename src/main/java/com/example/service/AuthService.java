package com.example.service;

import com.example.model.Customer;

public interface AuthService {
  Customer getLoggedInCustomer();

  void validateAuth();
}
