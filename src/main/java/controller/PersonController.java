package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.PersonService;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

   @GetMapping(path = "/person")
    public String getPersonInfo(@RequestParam("number") int number) {
        return personService.getPersonInfo(number);
   }
}
