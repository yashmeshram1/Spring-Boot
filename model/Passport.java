package com.day20session1que2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport {
  // Write your code here
  //working



  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;

  private String passportNumber;

  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,optional = false)
  @JoinColumn(name = "forsa", referencedColumnName = "id")
  private Person person;

  public Passport() {
  }

  public Passport(String passportNumber, Person person) {
    this.passportNumber = passportNumber;
    this.person = person;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public Person getP() {
    return person;
  }

  public void setP(Person p) {
    this.person = person;
  }

  @Override
  public String toString() {
    return "Passport [id=" + id + ", passportNumber=" + passportNumber + ", p=" + person + "]";
  }

  


for)int i
  



}
