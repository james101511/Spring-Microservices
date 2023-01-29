package com.james.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/customers")
public record CustomerController(
    CustomerService service
) {

  @PostMapping
  public void registerCustomer(@RequestBody CustomerRequest request) {
    log.info("mew customer registration {}", request);
    service.registerCustomer(request);
  }
}
