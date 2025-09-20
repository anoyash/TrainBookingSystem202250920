package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String address;
    private String email;
    private String uuid;  /* Unique user id for the user */
    private String password;
    private List<Ticket> ticketsBooked;

    public User(String name, String address, String email, String uuid, String password, List<Ticket> ticketsBooked) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.uuid = uuid;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }
}
