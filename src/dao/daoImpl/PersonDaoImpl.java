package dao.daoImpl;

import dao.PersonDao;
import datebase.DateBase;
import models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDaoImpl implements PersonDao {

    public static long personIdCounter = 0;
    @Override
    public void savePerson(Person person) {
DateBase.persons.add(person);
        System.out.println("saved: "+person);
    }

    @Override
    public List<Person> getAllPerson() {
        return DateBase.persons;
    }

    @Override
    public Person getPersonByName(String name) {
        return DateBase.persons.stream().
                filter(person ->person.getFirstName().equals(name)).
                findFirst().orElse(null);
    }

    @Override
    public Person updatePersonById(Long id, String newfirstName, int age) {
        Optional<Person> optionalPerson =DateBase.persons.stream()
                .filter(person -> person.getIdPerson().equals(id)).findFirst();
        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            person.setFirstName(newfirstName);
            person.setAge(age);
            System.out.println("Person updated: " + person);
            return person;
        }
        return null;
    }

    @Override
    public String deletePersonById(Long id) {
      Optional<Person>optionalPerson= DateBase.persons.stream().filter(person -> person.getIdPerson().equals(id)).findFirst();
        if (optionalPerson.isPresent()) {
           DateBase.persons.remove(optionalPerson.get());
            System.out.println("Person deleted: " + optionalPerson.get());
        }   return "Person not found";
    }
}
