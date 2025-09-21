package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import ticket.booking.util.UserServiceUtil;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String userId;
    private String uuid;  /* Unique user id for the user */
    private String password;
    private String hashedPassword;
    private String name;
    private String address;
    private String email;
    private List<Ticket> ticketsBooked;

    public User(){
    }

    public User(List<Ticket> ticketsBooked, String hashedPassword, String password, String email, String address, String name, String uuid, String userId) {
        this.ticketsBooked = ticketsBooked;
        this.hashedPassword = hashedPassword;
        this.password = password;
        this.email = email;
        this.address = address;
        this.name = name;
        this.uuid = uuid;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId(){
        return userId;
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

    public String getHashedPassword(){
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }
}
