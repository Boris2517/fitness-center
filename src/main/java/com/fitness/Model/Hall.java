package com.fitness.Model;

import javax.persistence.*;

@Entity
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="capacity")
    private int capacity;
    @Column(name="mark")
    private String mark;



//    Terminska lista treninga (koji trening se održava u kom danu i po kojoj ceni
//    - isti trening se može u istim danima održavati u različitim salama, veza
//    N:N), koja sadrži i broj prijavljenih članova za taj termin.


    public Hall() {
    }

    public Hall(Long id, int capacity, String mark) {
        this.id = id;
        this.capacity = capacity;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
