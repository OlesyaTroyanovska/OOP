import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexMatcher {

    public static boolean isEventMatches(String input, EventRegexType parserType ) {

        Pattern pattern = Pattern.compile(EventRegex.getSuitableRegex(parserType));
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static boolean isMemberMatches (String input, MemberRegexType parserType) {

        Pattern pattern = Pattern.compile(MemberRegex.getSuitableRegex(parserType));
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

}
