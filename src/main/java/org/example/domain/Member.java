package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;

}
