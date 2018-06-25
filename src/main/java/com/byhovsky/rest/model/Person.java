package com.byhovsky.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    private int personId;
    private String firstName;
    private int age;

    /**
     * Getter for property 'personId'.
     *
     * @return Value for property 'personId'.
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Setter for property 'personId'.
     *
     * @param personId Value to set for property 'personId'.
     */
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    /**
     * Getter for property 'firstName'.
     *
     * @return Value for property 'firstName'.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for property 'firstName'.
     *
     * @param firstName Value to set for property 'firstName'.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for property 'age'.
     *
     * @return Value for property 'age'.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for property 'age'.
     *
     * @param age Value to set for property 'age'.
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (personId != person.personId) return false;
        if (age != person.age) return false;
        return firstName != null ? firstName.equals(person.firstName) : person.firstName == null;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}