package com.byhovsky.rest.service;

import com.byhovsky.rest.model.Person;
import com.byhovsky.rest.model.Response;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Path("/person")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class PersonServiceImpl implements PersonService {

    private static Map<Integer, Person> persons = new HashMap<>();

    /**
     * {@inheritDoc}
     */
    @Override
    @POST
    @Path("/add")
    public Response addPerson(Person p) {
        Response response = new Response();
        if (persons.get(p.getPersonId()) != null) {
            response.setStatus(false);
            response.setMessage("Person Already Exists");
            return response;
        }
        persons.put(p.getPersonId(), p);
        response.setStatus(true);
        response.setMessage("Person created successfully");
        return response;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    @GET
    @Path("/{id}/get")
    public Person getPerson(@PathParam("id") int id) {
        return persons.get(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @GET
    @Path("/getAll")
    public Person[] getAllPersons() {
        Set<Integer> ids = persons.keySet();
        Person[] person = new Person[ids.size()];
        int i = 0;
        for (Integer id : ids) {
            person[i] = persons.get(id);
            i++;
        }
        return person;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @GET
    @Path("/{id}/delete")
    public Response deletePerson(@PathParam("id") int id) {
        Response response = new Response();
        if (persons.get(id) == null) {
            response.setStatus(false);
            response.setMessage("Person Doesn't Exists");
            return response;
        }
        persons.remove(id);
        response.setStatus(true);
        response.setMessage("Person deleted successfully");
        return response;
    }
}