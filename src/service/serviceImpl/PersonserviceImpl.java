package service.serviceImpl;

import dao.PersonDao;
import dao.daoImpl.PersonDaoImpl;
import models.Person;
import service.PersonService;

import java.util.List;

public class PersonserviceImpl implements PersonService {
    PersonDao personDao=new PersonDaoImpl();
    @Override
    public void savePerson(Person person) {
        personDao.savePerson(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return personDao.getAllPerson();
    }

    @Override
    public Person getPersonByName(String name) {
        return personDao.getPersonByName(name);
    }

    @Override
    public Person updatePersonById(Long idPerson, String newfirstName, int age) {
        return personDao.updatePersonById(idPerson,newfirstName,age);
    }

    @Override
    public String deletePersonById(Long idPerson) {
        return personDao.deletePersonById(idPerson);
    }
}
