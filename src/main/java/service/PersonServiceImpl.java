package service;

import domain.Driver;
import domain.Person;
import domain.TrackDriver;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    Person[] people = {
            new Person(
                    "Liberia",
                    "Nicte",
                    "123654"),

            new Driver(
                    "Loukas",
                    "Rabiu",
                    "123654",
                    "158897"),

            new TrackDriver(
                    "Abraam",
                    "Booz",
                    "123845",
                    "236587")
    };

    @Override
    public String getPersonInfo(int number){
        final Person person;
        person = people[number];
        final String personDescription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport();
        return personDescription;
    }

}
