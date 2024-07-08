package com.panha.demo_core_backend.models;

import com.panha.base.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "bikes")
public class Bike extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id = 0L;
    String name;
    String color;
    Double price=0.00;
}
