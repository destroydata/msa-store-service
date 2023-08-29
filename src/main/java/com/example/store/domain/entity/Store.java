package com.example.store.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name="Stores") @Entity
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder @Getter
public class Store {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String name;
    private String img;
    @ManyToOne
    private Owner owner;
    @OneToMany(mappedBy = "store")
    private List<Menu> menus;
}
