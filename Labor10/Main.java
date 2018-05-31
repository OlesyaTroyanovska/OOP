

import java.util.*;
import java.sql.Struct;

public class Main extends Planning  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int n;
        int d;
        int ind;

        Planning [] zaxid = new Planning[10];

        for(int i = 0; i < 10; i ++) {
            zaxid[i] = new Planning();
            zaxid[i].exist = false;
        }

        System.out.println("Hello! ");

        while (true) {

            System.out.println("What do u want to do:");
            System.out.println("Press 1 to look at all events");
            System.out.println("Press 2 to create new event");
            System.out.println("Press 3 to exit");

            n = in.nextInt();

            if(n == 3){
                System.out.println("Bye!");
                break;

            }
            if (n == 1) {
                if(zaxid[0].exist == false){
                    System.out.println("Here are no events yet");
                    System.out.println(" ");
                    n = 0;
                    continue;
                }

                for (int i = 0; i < 10; i++) {

                    if (zaxid[i].exist == false)
                        break;
                    System.out.println( "event " + i + ":" + zaxid[i].name);
                }

                System.out.println("Do you want to see details?");
                System.out.println(" Press 1 - YES      Press 2 - NO");
                d = in.nextInt();
                System.out.println(" ");
                System.out.println(" ");

                if( d == 1){
                    System.out.println("Details of which event you want to see? ( enter index of event)");
                    ind = in.nextInt();
                    System.out.println("Name of event: " + zaxid[ind].name);
                    System.out.println("Event will be at: " + zaxid[ind].city);
                    System.out.println("Event will be on " + zaxid[ind].month + "; " + zaxid[ind].date + "th; " + zaxid[ind].start + ":00");
                    System.out.println("Event duration: " + zaxid[ind].duration + " minutes");
                    for(int i = 0; i < 5; i++){
                        System.out.print(zaxid[ind].description[i] + " ");
                    }
                    System.out.println(" ");
                    System.out.println("There will be " + zaxid[ind].amount + " members:");
                    for(int i = 0; i < zaxid[ind].amount; i++ ) {
                        System.out.print(zaxid[ind].members[i] + ", ");
                    }
                    System.out.println(" ");
                }
                else {
                    n = 1;
                    continue;
                }
            }

            else{

                zaxid[num].exist = true;
                System.out.println("Enter name of the event:");
                zaxid[num].name = in.next();
                System.out.println("Enter month when event start:");
                zaxid[num].month = in.next();
                System.out.println("Enter date:");
                zaxid[num].date = in.next();
                System.out.println("Enter hour of the begining:");
                zaxid[num].start = in.nextInt();
                System.out.println("Enter duration (minutes):");
                zaxid[num].duration = in.nextInt();
                System.out.println("Enter city:");
                zaxid[num].city = in.next();
                System.out.println("Enter description of the event ( 5 strings ): ");
                zaxid[num].description = new String[5];
                for(int i = 0; i <5; i++ ) {
                    zaxid[num].description[i] = in.next();
                    if (zaxid[num].description[i].equals(';'))
                        break;
                }
                System.out.println("Enter amount of members");
                zaxid[num].amount = in.nextInt();
                zaxid[num].members = new String[zaxid[num].amount];
                for(int j = 0; j < zaxid[num].amount; j++ ){
                    System.out.println("Enter member " + (j+1) + " name " + ":");
                    zaxid[num].members[j] = in.next();
                }

                num++;
            }
            n = 0;
        }
    }
}


