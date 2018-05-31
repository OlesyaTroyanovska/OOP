

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome.");

        Event event = new Event();

        System.out.println("Enter date(example 25.05.2018) :");
        String eventDate = input.next();
        event.setDate(eventDate);


        System.out.println("time (example 12:30:00) :");
        String eventTime = input.next();
        event.setTime(eventTime);


        System.out.println("duration (ч.) :");
        String eventDuration = input.next();
        event.setEventDuration(Integer.parseInt(eventDuration));


        System.out.println("place :");
        input.nextLine();
        String eventPlace = input.nextLine();
        event.setEventPlace(eventPlace);


        System.out.println("description:");
        String eventDescription = input.nextLine();
        event.setDescription(eventDescription);


        System.out.println("amount of members.");

        int membersCount = input.nextInt();

        Member [] members = new Member[membersCount];

        addMembers(members);

        event.setMembers(members);

        System.out.println("Event added");

        System.out.println(event);

    }

    private static void addMembers (Member [] members) throws IllegalArgumentException {


        for (int i = 0; i < members.length; i++) {

            Member newMember = new Member();

            System.out.println("name : ");
            String name = input.next();
            newMember.setName(name);

            System.out.println("surname :");
            String surName = input.next();
            newMember.setSurName(surName);

            System.out.println("date of birth  (example 16.03.1993) :");
            String dateOfBirth = input.next();
            newMember.setDateOfBirth(dateOfBirth);

            System.out.println("male or female (m or  f)");
            String gender = input.next();
            newMember.setGender(gender);

            System.out.println("hobby:");
            String occupation = input.next();
            newMember.setOccupation(occupation);

            members[i] = newMember;

            System.out.println("added!");

        }
    }
}




