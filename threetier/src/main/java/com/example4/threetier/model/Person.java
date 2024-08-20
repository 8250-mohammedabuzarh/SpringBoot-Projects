package com.example4.threetier.model;

import jakarta.persistence.*;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "name")
    public String name;

    @Column(name = "role")
    public String role;

    public Person() {}

    public Person(long id, String name, String role) {

        this.id = id;
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(String.valueOf(id));
        builder.append(", ");
        builder.append(name);
        builder.append(", ");
        builder.append(role);

        return builder.toString();
    }
}
