package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;
    private List<User> userList;

    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private static final String USERS_PATH = "./LocalDB/User.json";

    public UserBookingService(User newUser) throws IOException {
        this.user = newUser;
        File users = new File(USERS_PATH);
        /* We are using object mapper for de-serializing the json data.
        * And vice - versa of this is called serialization
        */
        this.userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean loginUser(User newUser){
        Optional<User> foundUser = userList.stream().filter( user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getHashedPassword(), user1);
        }).findFirst();

        return foundUser.isPresent();
    }
}
