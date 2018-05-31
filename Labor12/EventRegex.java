

public class EventRegex {

    private static final String ALLOWED_EVENT_DATE = "([0][1-9]|[12][0-9]|[3][02])\\."
            + "([0][1-9]|[1][0-2])\\."
            +"(19[0-9]{2}|20[0-9]{2})";


    private static final String ALLOWED_EVENT_TIME = "([0-1][0-9]|[2][0-3]):"
            + "([0-5][0-9]):"
            + "([0-5][0-9])";

    private static final String ALLOWED_EVENT_DURATION = "[0-9]+";

    private static final String ALLOWED_EVENT_PLACE = "[Р-п]{1}[р-џ]+,*\\s*[Р-пр-џ]+";

    private static final String ALLOWED_EVENT_DESCRIPTION = "[Р-пр-џ]*\\s*";


    public static String getSuitableRegex (EventRegexType parserType) {

        switch (parserType) {

            case EventDate :
                return EventRegex.ALLOWED_EVENT_DATE;
            case EventTime :
                return EventRegex.ALLOWED_EVENT_TIME;
            case EventDescription :
                return EventRegex.ALLOWED_EVENT_DESCRIPTION;
            case EventDuration :
                return EventRegex.ALLOWED_EVENT_DURATION;
            case EventPlace :
                return EventRegex.ALLOWED_EVENT_PLACE;

            default:
                break;
        }

        return null;
    }
}


