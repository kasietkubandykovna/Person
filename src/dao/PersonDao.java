package dao;

import models.Person;

import java.util.List;

public interface PersonDao {
    void savePerson(Person person);
    List<Person> getAllPerson();
    Person getPersonByName(String name);
    Person updatePersonById(Long idPerson,String newfirstName,int age);
    String deletePersonById(Long idPerson);
}
