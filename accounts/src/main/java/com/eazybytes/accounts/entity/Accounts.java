package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name="customer_id")
    private Long customerId;

    @Column(name="account_number")
    @Id
    private Long accountNumber;


    @Column(name="accountType")
    private String accountType;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="branch_address")
    private String branchAdress;
}
