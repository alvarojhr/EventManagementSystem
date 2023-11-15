package org.example;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private EventDatabase database;

    public EventManager(EventDatabase database) {
        this.database = database;
    }

    public boolean createEvent(Event event) {
        if (event == null || event.getEventId() == null || event.getTitle() == null) {
            return false;
        }
        database.saveEvent(event);
        return true;
    }

    public boolean cancelEvent(String eventId) {
        if (eventId == null || database.getEventById(eventId) == null) {
            return false;
        }
        database.deleteEvent(eventId);
        return true;
    }

    public Event getEventById(String eventId) {
        if (eventId == null) {
            return null;
        }
        return database.getEventById(eventId);
    }

    public List<Event> getEventsByOrganizer(String organizerId) {
        if (organizerId == null) {
            return new ArrayList<>();
        }
        return database.getEventsByOrganizerId(organizerId);
    }

    // Additional methods as needed
}

