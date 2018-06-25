package com.byhovsky.rest.service;


import com.byhovsky.rest.model.Person;
import com.byhovsky.rest.model.Response;

public interface PersonService {
    /**
     * Add person
     *
     * @return Value for property 'allPersons'.
     */
    Response addPerson(Person p);

    /**
     * Delete person
     *
     * @return Value for property 'allPersons'.
     */
    Response deletePerson(int id);

    /**
     * Get person
     *
     * @return Value for property 'allPersons'.
     */
    Person getPerson(int id);

    /**
     * Get all persons
     *
     * @return Value for property 'allPersons'.
     */
    Person[] getAllPersons();
}