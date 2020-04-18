package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;



/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
         
            
    private int passportNumber;
    private String name;
    private String middleName;
    private String secondName;
    private String surname;
    private LocalDate birthDate;
    private LocalDate receiveDate;
    private String receivePlace;
    
    
    public Passport(){
    }    
    
    public Passport(String name, String middleName, String secondName, String surname, LocalDate birthDate, int passportNumber, 
             LocalDate receiveDate, String receivePlace){
       this.name = name;
       this.middleName = middleName;
       this.secondName = secondName;
       this.surname = surname;
       this.birthDate = birthDate;
       this.passportNumber = passportNumber;
       this.receiveDate = receiveDate;
       this.receivePlace = receivePlace;
    }
     
    public void setName(String name){
    this.name = name;      
    }
    public String getName(){
    return name;
    }
    
    public void setMiddleName(String middleName){
    this.middleName = middleName;      
    }
    public String getMiddleName(){
    return middleName;
    }
    
    public void setSecondName(String secondName){
    this.secondName = secondName;      
    }
    public String getSecondName(){
    return secondName;
    }
    
    public void setSurname(String surName){
    this.surname = surname;      
    }
    public String getSurname(){
    return surname;
    }
    
    public void setBirthDate(LocalDate birDate){
    this.birthDate = birthDate;      
    }
    public LocalDate getBirDate(){
    return birthDate;
    }
    
    public void setPassportNumber(int passportNumber){
    this.passportNumber = passportNumber;      
    }
    public int getPassportNumber(){
    return passportNumber;
    }

    public void setReceiveDate(LocalDate receiveDate){
    this.receiveDate = receiveDate;      
    }
    public LocalDate getReceiveDate(){
    return receiveDate;
    } 
    
    public void setReceivePlace(String receivePlace){
    this.receivePlace = receivePlace;      
    }
    public String getReceivePlace(){
    return receivePlace;
    }
    
    
    
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
