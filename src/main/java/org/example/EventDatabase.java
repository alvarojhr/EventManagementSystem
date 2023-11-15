package org.example;

import java.util.List;

public interface EventDatabase {
    void saveEvent(Event event);
    void deleteEvent(String eventId);
    Event getEventById(String eventId);
    List<Event> getEventsByOrganizerId(String organizerId);
    // Additional methods for database interaction
}
