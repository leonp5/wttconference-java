
package de.wttconference.backend.controller;


import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.wttconference.backend.model.Attendee;
import de.wttconference.backend.services.AttendeeService;

@RestController
@RequestMapping("attendees")
public class AttendeeController {

  @PostConstruct
  public void test() { System.out.println("started");}
   
  private final AttendeeService service;

  public AttendeeController(AttendeeService service) {
    this.service = service;
  }

@GetMapping
public Iterable<Attendee> list() {
  return service.list();
}

@PostMapping
public Attendee addAttendee(@RequestBody Attendee attendee) {
  return service.addAttendee(attendee);
}

}