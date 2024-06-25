import dao.CarDao;
import dao.daoImpl.PersonDaoImpl;
import datebase.DateBase;
import models.Car;
import models.Person;
import models.SocialMedia;
import service.CarService;
import service.PersonService;
import service.SocialMediaService;
import service.serviceImpl.CarServiceImpl;
import service.serviceImpl.PersonserviceImpl;
import service.serviceImpl.SocialMediaServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        PersonService personService = new PersonserviceImpl();
        CarService carService = new CarServiceImpl();
        SocialMediaService socialMediaService = new SocialMediaServiceImpl();
        System.out.println("Save Person");
        personService.savePerson(new Person(1L,"Kasi","Kubandykova",24,"fdfds"));
        personService.savePerson(new Person(2L,"Saku","Ulanova",32,"sfdss"));
        personService.savePerson(new Person(3L,"Asyl","Kutubekova",14,"agdsgfh"));

        System.out.println(" ");
        System.out.println("get all Person");
        System.out.println(personService.getAllPerson());
        System.out.println(" ");
        System.out.println("get Person By Name");
        System.out.println(personService.getPersonByName("Kasi"));
        System.out.println(" ");
        System.out.println("update Person ");
        System.out.println(personService.updatePersonById(2L, "Tamara", 16));
        System.out.println(" ");
        System.out.println("deleted Person ");
        System.out.println(personService.deletePersonById(3L));

        System.out.println(" ");
        System.out.println(" save cars");
        carService.saveCar(new Car(1L,"mers","mersS", 2011));
        carService.saveCar(new Car(2L,"bmw","bmw6", 2020));
        carService.saveCar(new Car(3L,"toyota","mfsdf", 2016));
        System.out.println(" ");
        System.out.println(" get car");
        System.out.println(carService.getCarById(2L));
        System.out.println(" ");
        System.out.println(" get car ");
        carService.getCarByPersonId(1L);
        System.out.println(" ");
        carService.updateCarById(1L,"subaru","subaru4");
        System.out.println("  ");
        System.out.println("  ");
        carService.deleteCarById(2L);

        System.out.println(" ");
        System.out.println(" ");

        socialMediaService.assignSocialMediaToPerson(new Person(1L,"Kasi","Kubandykova",24,"fdfds"),new SocialMedia(1L,"name"));
        socialMediaService.assignSocialMediaToPerson(new Person(2L,"Saku","Ulanova",32,"sfdss"),new SocialMedia(2L,"assdg"));
        socialMediaService.assignSocialMediaToPerson(new Person(3L,"Asyl","Kutubekova",14,"agdsgfh"),new SocialMedia(3L,"nfdge"));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(socialMediaService.saveSocialMedia(new SocialMedia(1L, "dfdf")));
        System.out.println(socialMediaService.saveSocialMedia(new SocialMedia(2L, "hdfgsg")));
        System.out.println(socialMediaService.saveSocialMedia(new SocialMedia(3L, "ffdh")));
        System.out.println(" ");
        System.out.println(socialMediaService.getSocialMediaById(1L));
        System.out.println("");
socialMediaService.deleteSocialMediaById(2L);
        System.out.println("  ");
        socialMediaService.deleteAllSocialMediaByPersonId(2L);
        socialMediaService.getAllSocialMediaByPersonId(2L);
    }
}

