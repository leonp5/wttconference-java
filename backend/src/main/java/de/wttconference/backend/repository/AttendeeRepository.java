package de.wttconference.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import de.wttconference.backend.model.Attendee;

public interface AttendeeRepository extends PagingAndSortingRepository<Attendee, String> {}
