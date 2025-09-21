package ticket.booking.entities;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private Integer trainNo;
    private List<List<Integer>> trainSeats;
    // Industry practice is they use String for Time as well
    private Map<String, String> stationTimes;
    private List<String> stations;
}
