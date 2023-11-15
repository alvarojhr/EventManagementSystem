package org.example;

public class Event {
    private String eventId;
    private String title;
    private String description;
    private User organizer;

    public Event(String eventId, String title, String description, User organizer) {
        this.eventId = eventId;
        this.title = title;
        this.description = description;
        this.organizer = organizer;
    }

    // Getters and Setters
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOrganizer() {
        return organizer;
    }

    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }

    // Additional methods as necessary
}
