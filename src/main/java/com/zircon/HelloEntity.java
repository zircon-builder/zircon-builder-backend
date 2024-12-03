package com.zircon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class HelloEntity {
    @GeneratedValue
    @Id
    private Long id;
    private String message;
}
