// In der Service Datei hat man für gewöhnlich die "Business Logik", Validierungen etc.

package de.wttconference.backend.services;

import org.springframework.stereotype.Service;

import de.wttconference.backend.model.Attendee;
import de.wttconference.backend.repository.AttendeeRepository;

@Service

public class AttendeeService {

private final AttendeeRepository repository;

public AttendeeService(AttendeeRepository repository) {
  this.repository = repository;
}

public Iterable<Attendee> list() {
  return this.repository.findAll();
}

public Attendee addAttendee(Attendee attendee) {
  this.repository.save(attendee);
  return attendee;
}



}

