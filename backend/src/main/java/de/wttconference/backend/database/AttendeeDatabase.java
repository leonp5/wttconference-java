package de.wttconference.backend.database;

import java.util.ArrayList;
import java.util.List;

import de.wttconference.backend.model.Attendee;

public class AttendeeDatabase {

private static AttendeeDatabase db;

public static AttendeeDatabase instance () {
  if(db != null) {
    return db;
  }
  db = new AttendeeDatabase();
  return db;
}

private List<Attendee> attendees = new ArrayList<>();

public void addAttendee(Attendee attendee){
  this.attendees.add(attendee);
}

public List<Attendee> getAll(){
  return this.attendees;
}

}