package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;
    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "app/src/main/java/ticket/booking/localdb/User.json";

    public UserBookingService(User newUser) throws  IOException{
        this.user = newUser;
        this.userList = getUserList();
    }

    public List<User> getUserList() throws IOException{
        File users = new File(USERS_PATH);
        /* We are using object mapper for de-serializing the json data.
         * And vice - versa of this is called serialization
         */
        return  objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean loginUser(User newUser){
        Optional<User> foundUser = userList.stream().filter( user1 -> {
            return user1.getName().equals(user.getName())
                    && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();

        return foundUser.isPresent();
    }
}
