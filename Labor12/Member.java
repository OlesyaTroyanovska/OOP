

public class Member {


    private String name;
    private String surName;
    private String dateOfBirth;
    private String gender;
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        boolean passed = RegexMatcher.isMemberMatches(name, MemberRegexType.MemberName);

        if (passed)	this.name = name;

        else  {
            this.name = null;
            throw new IllegalArgumentException("Имя участника введено не верно.");
        }
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {

        boolean passed  = RegexMatcher.isMemberMatches(surName, MemberRegexType.MemberSurName);

        if (passed)	this.surName = surName;

        else  {
            this.surName = null;
            throw new IllegalArgumentException("Фамилия участника введена не верно.");
        }

    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {

        boolean passed = RegexMatcher.isMemberMatches(dateOfBirth, MemberRegexType.MemberDateOfBirth);

        if (passed) this.dateOfBirth = dateOfBirth;

        else {
            this.dateOfBirth = null;
            throw new IllegalArgumentException("Дата рождения участника введена не верно.");
        }

    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {

        boolean passed = RegexMatcher.isMemberMatches(gender, MemberRegexType.MemberGender);

        if (passed) this.gender = gender;

        else {
            this.gender = null;
            throw new IllegalArgumentException("Пол участника введен не верно.");
        }


    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {

        boolean passed = RegexMatcher.isMemberMatches(occupation, MemberRegexType.MemberOccupation);

        if (passed) this.occupation = occupation;

        else {
            this.occupation = null;
            throw new IllegalArgumentException("Деятельность участника введена не верно.");
        }
    }

    @Override
    public String toString() {
        return "\n Участник \n [Имя = " + name + ",\n Фамилия = " + surName + ",\n Дата рождения = " + dateOfBirth + ",\n Пол = " + gender
                + ",\n Вид деятельности = " + occupation + "]";
    }

}

