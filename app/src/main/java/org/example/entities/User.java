package org.example.entities;

import java.util.List;

public class User {
    private String name;
    private String address;
    private String email;
    private String uuid;  /* Unique user id for the user */
    private String hashedPassword;
    private List<Ticket> ticketsBooked;


}
