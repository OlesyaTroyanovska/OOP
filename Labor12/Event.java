
import java.util.Arrays;

public class Event {

    private String eventDate;

    private String eventTime;

    private int eventDuration;

    private String eventPlace;

    private String description;

    public String getDate() {
        return eventDate;
    }

    public void setDate(String date) {

        boolean passed = RegexMatcher.isEventMatches(date, EventRegexType.EventDate);

        if (passed) this.eventDate = date;

        else {
            this.eventDate = null;
            throw new IllegalArgumentException("Дата мероприятия введена не верно.");
        }

    }

    public String getTime() {
        return eventTime;
    }

    public void setTime(String time) {

        boolean passed = RegexMatcher.isEventMatches(time, EventRegexType.EventTime);

        if (passed) this.eventTime = time;

        else {
            this.eventTime = null;
            throw new IllegalArgumentException("Время мероприятия введено не верно.");
        }
    }

    public int getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(int eventDuration) {

        boolean passed = RegexMatcher.isEventMatches(Integer.toString(eventDuration), EventRegexType.EventDuration);

        if (passed) this.eventDuration = eventDuration;

        else {
            this.eventDuration = 0;
            throw new IllegalArgumentException("Время мероприятия введено не верно.");
        }
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {

        boolean passed = RegexMatcher.isEventMatches(eventPlace, EventRegexType.EventPlace);

        if (passed) this.eventPlace = eventPlace;

        else {
            this.eventPlace = null;
            throw new IllegalArgumentException("Место мероприятия введено не верно.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        boolean passed = RegexMatcher.isEventMatches(description, EventRegexType.EventDescription);

        if (passed) this.description = description;

        else {
            this.description = null;
            throw new IllegalArgumentException("Описание мероприятия введено не верно.");
        }
    }

    private Member [] members;

    public void setMembers (Member [] members) {
        this.members = members;
    }

    public Member [] getMembers () {
        return members;
    }

    @Override
    public String toString() {
        return "мероприяия \n [Дата = " + eventDate + ",\n время = " + eventTime + ",\n Длительность = " + eventDuration
                + ",\n Место = " + eventPlace + ",\n Описание = " + description + ",\n Участники = "
                + Arrays.toString(members) + "]";
    }



}


