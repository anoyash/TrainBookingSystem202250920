package org.example.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {
    private String ticketId;
    private String usedId;
    private Date dateOfTravel;
    private LocalDateTime travelTime;
    private Train userTrain;
    private String source;
    private String destination;
}
