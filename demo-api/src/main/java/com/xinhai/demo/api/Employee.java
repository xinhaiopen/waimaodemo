package com.xinhai.demo.api;

import java.io.Serializable;
import java.util.Date;

/**
 * 雇员信息实体类.
 */
public class Employee implements Serializable {

  private static final long serialVersionUID = 1057219342940862594L;

  /**
   * 性别.
   */
  public enum Sex {
    male, female
  }

  private int id;
  private String name;
  private String code;
  private Sex sex;
  private int age;
  private Date birthday;
  private String nationality;
  private String interest;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Sex getSex() {
    return sex;
  }

  public void setSex(Sex sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }
}
