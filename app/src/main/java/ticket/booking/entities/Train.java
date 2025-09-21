package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Train {
    private String trainId;
    private Integer trainNo;
    private List<List<Integer>> trainSeats;
    // Industry practice is they use String for Time as well
    private Map<String, String> stationTimes;
    private List<String> stations;

    public Train() {
    }

    public Train(String trainId, Integer trainNo, List<List<Integer>> trainSeats, Map<String, String> stationTimes, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.trainSeats = trainSeats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public Integer getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(Integer trainNo) {
        this.trainNo = trainNo;
    }

    public List<List<Integer>> getTrainSeats() {
        return trainSeats;
    }

    public void setTrainSeats(List<List<Integer>> trainSeats) {
        this.trainSeats = trainSeats;
    }

    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public void setStationTimes(Map<String, String> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
}
