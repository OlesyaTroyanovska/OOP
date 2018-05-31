

import java.io.*;
import java.util.Scanner;

    public class Write {
        public void execute() {
            Scanner in = new Scanner(System.in);
            File f = new File("D:\\IDE\\test2.txt");
            System.out.println("Your event name: ");
            String name = in.nextLine();
            System.out.println("When your event starts(Month): ");
            String month = in.nextLine();
            System.out.println("When your event starts(date): ");
            String date = in.nextLine();
            System.out.println("When your event starts(hour): ");
            int start =  in.nextInt();
            System.out.println("Duration of the event(minutes): ");
            int dur = in.nextInt();
            System.out.println("Where your event will be(city): ");
            String city = in.next();
            System.out.println("Amount of members: ");
            int mem = in.nextInt();

            try {
                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
                writer.println("Name - " + name);
                writer.println("Month - " + month);
                writer.println("Date - " + date);
                writer.println("Hour - " + start + " : 00");
                writer.println("Duration - " + dur + "minutes");
                writer.println("City - " + city);
                writer.println("Members - " + mem);

                writer.flush();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        public void autofill() {

            File f = new File("D:\\IDE\\test2.txt");

            String name = "auto_name";

            String month = "auto_month";

            String date = "auto_date";

            int start = 0;

            int dur = 0;

            String city = "auto_city";

            int mem = 0;

            try {
                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
                writer.println("Name - " + name);
                writer.println("Month - " + month);
                writer.println("Date - " + date);
                writer.println("Hour - " + start + " : 00");
                writer.println("Duration - " + dur + "minutes");
                writer.println("City - " + city);
                writer.println("Members - " + mem);

                writer.flush();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

}
