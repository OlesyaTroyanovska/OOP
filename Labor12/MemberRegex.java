public class MemberRegex {



    public static final String ALLOWED_GENDERS = "[ЬЦ]";

    public static final String ALLOWED_NAMES = "[Р-п]{1}[р-џ]{1,25}-*[р-џ]*";

    public static final String ALLOWED_SURNAMES = "[Р-п]{1}[р-џ]{1,50}-*[р-џ]*";

    public static final String  ALLOWED_BIRTH_DATE = "([0][1-9]|[12][0-9]|[3][02])\\."
            + "([0][1-9]|[1][0-2])\\."
            +"(19[0-9]{2}|20[0-9]{2})";

    public static final String ALLOWED_OCCUPATION = "[Р-пр-џ]+";

    public static String getSuitableRegex (MemberRegexType parserType) {

        switch (parserType) {

            case MemberName :
                return MemberRegex.ALLOWED_NAMES;
            case MemberSurName :
                return MemberRegex.ALLOWED_SURNAMES;
            case MemberDateOfBirth :
                return MemberRegex.ALLOWED_BIRTH_DATE;
            case MemberGender :
                return MemberRegex.ALLOWED_GENDERS;
            case MemberOccupation :
                return MemberRegex.ALLOWED_OCCUPATION;

            default:
                break;
        }

        return null;
    }

}


