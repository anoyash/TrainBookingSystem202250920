package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String address;
    private String email;
    private String uuid;  /* Unique user id for the user */
    private String hashedPassword;
    private List<Ticket> ticketsBooked;

    public User(String name, String address, String email, String uuid, String hashedPassword, List<Ticket> ticketsBooked) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.uuid = uuid;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getUuid() {
        return uuid;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }
}
