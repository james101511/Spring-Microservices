package com.james.customer;

public record CustomerRequest(
    String firstName,
    String lastName,
    String email
) {

}
