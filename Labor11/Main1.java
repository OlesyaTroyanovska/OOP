
    import java.util.*;
	import java.io.*;
	import java.nio.*;

    public class Main1 extends Write{

        public static void main(String[] args) throws IOException {

            Scanner in = new Scanner(System.in);

            int n;
            ArrayList<String> list = new ArrayList<String>();

            while (true) {

                System.out.println("Hello! What do you want to do?");
                System.out.println("1. Scan file");
                System.out.println("2. see file");
                System.out.println("3. write to file");
                System.out.println("4. auto fill");
                System.out.println("5. delete file");
                System.out.println("6. exit");


                n = in.nextInt();


                if (n == 1) {

                    String s;
                    try (BufferedReader br = new BufferedReader(new FileReader("D:\\IDE\\test2.txt"))) {

                        while ((s = br.readLine()) != null) {
                            if (!s.isEmpty()) {
                                list.add(s);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (n == 2) {
                    String s;
                    try (BufferedReader br = new BufferedReader(new FileReader("D:\\IDE\\test2.txt"))) {

                        while ((s = br.readLine()) != null) {
                            if (!s.isEmpty()) {
                                System.out.print(s);
                                System.out.println(" ");
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(" ");
                } else if (n == 3) {
                    Write write = new Write();
                    write.execute();
                }
                else if( n == 4){
                    Write a = new Write();
                    a.autofill();

                }
                else if( n == 5){

                    File f = new File("D:\\IDE\\test2.txt");
                    f.delete();
                }
                else if ( n == 6){
                    System.out.println("Goodbye!");
                    break;
                }


            }
        }
    }

