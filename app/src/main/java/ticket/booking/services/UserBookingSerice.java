package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.corba.se.spi.ior.ObjectKey;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingSerice {

    private User user;
    private List<User> userList;

    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private static final String USERS_PATH = "./LocalDB/User.json";

    public UserBookingSerice(User loggedUser) throws IOException {
        this.user = loggedUser;
        File users = new File(USERS_PATH);
        this.userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<User>>() {});
    }
}
