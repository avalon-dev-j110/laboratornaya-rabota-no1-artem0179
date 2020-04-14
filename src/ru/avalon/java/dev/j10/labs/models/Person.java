package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;
import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    private Passport passportData;
    private Address livingAddress;


    public Person(String name, String middleName, String secondName, String surname,
            LocalDate birthDate, int passportNumber, LocalDate receiveDate,
            String receivePlace, String country, String city, String street,
            int houseNumber, int flatNumber) {

        passportData = new Passport(name, middleName, secondName, surname, birthDate, passportNumber,
                receiveDate, receivePlace);
        livingAddress = new Address(country, city, street, houseNumber, flatNumber);

    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
     * Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
     * Первую букву второго имени, и Фамилию, разделённые пробелом. После
     * Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
     * Фамилия, то возвращает их, разделённые пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */

        if (passportData.getSecondName() == null) {
            String fullName = passportData.getName() + " " + passportData.getMiddleName()
                    + " " + passportData.getSurname();
            return fullName;
        } else {
            String fullName = passportData.getName() + " " + passportData.getSecondName().charAt(0)
                    + "." + " " + passportData.getSurname();
            return fullName;
        }

    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной регистрации человека,
     * согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {

        String getAddress = livingAddress.getCountry() + ", г." + livingAddress.getCity()
                + ", " + livingAddress.getStreet() + ", " + livingAddress.getHouseNumber()
                + "-" + livingAddress.getFlatNumber();
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return getAddress;
    }
}
