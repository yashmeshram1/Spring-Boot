package com.day20session1que2.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Long id;

   private String name;

   @OneToOne (mappedBy = "person",fetch = FetchType.LAZY)
   private Passport passport;

   public Person() {
   }

   public Person(String name) {
    this.name = name;
   }

   public Long getId() {
    return id;
   }

   public void setId(Long id) {
    this.id = id;
   }

   public String getName() {
    return name;
   }

   public void setName(String name) {
    this.name = name;
   }

   public Passport getPassport() {
    return passport;
   }

   public void setPassport(Passport passport) {
    this.passport = passport;
   }

   @Override
   public String toString() {
    return "Person [id=" + id + ", name=" + name + ", passport=" + passport + "]";
   }

   // cnhfhfh

   

}
