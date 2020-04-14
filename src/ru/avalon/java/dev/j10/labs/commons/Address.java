package ru.avalon.java.dev.j10.labs.commons;



/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

public class Address {
   private String country;
   private String city;
   private String street;
   private int houseNumber;
   private int flatNumber;
    
         
   public Address (String country, String city, String street, int houseNumber,
           int flatNumber){
   this.country = country;
   this.city = city;
   this.street = street;
   this.houseNumber = houseNumber;
   this.flatNumber = flatNumber;
   }
    
   public void setCountry(String country){
       this.country = country;
   }
   
   public String getCountry(){
       return country;
   }
           
   public void setCity(String city){
       this.city = city;
   }
   
   public String getCity(){
       return city;
   }
           
   public void setStreet(String street){
       this.street = street;
   }
   
   public String getStreet(){
       return street;
   }
   
   public void setHouseNumber(int houseNumber){
       this.houseNumber = houseNumber;
   }
   
   public int getHouseNumber(){
       return houseNumber;
   }

   public void setFlatNumber(int flatNumber){
       this.flatNumber = flatNumber;
   }
   
   public int getFlatNumber(){
       return flatNumber; 
   }
   
   
   
   
}