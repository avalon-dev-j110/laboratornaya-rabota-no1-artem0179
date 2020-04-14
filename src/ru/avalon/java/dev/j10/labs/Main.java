package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.*;


public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    
    public static void main(String args[]) {

              
        Person ivanov = new Person("Иван", "Иванович", null, "Иванов", LocalDate.of(1987,10,15),
                123456, LocalDate.of(2010,3,10), "Москва, 10 О/м", "Россия", "Москва",
                "Ленинский пр.", 20, 10);
        
        Person smith = new Person("John", null,"Edvard", "Smith", LocalDate.of(1995,8,15),
                123456, LocalDate.of(2010,11,03), "New York Police Dep.", "US", "New York",
                "Main st.", 15, 3);      
        


       
        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        
        String ivanovAddress = ivanov.getAddress();
        String smithAddress = smith.getAddress();
        
        
        
        System.out.println(ivanovFullName);
        System.out.println(smithFullName);
   
        System.out.println(ivanovAddress);
        System.out.println(smithAddress);
                
                
        }    
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */


          
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }

