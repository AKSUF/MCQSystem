
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class McqSystem {
    public static void main(String[] args) throws FileNotFoundException {
        String userName;
        Scanner scanner = new Scanner(System.in);
        int qcs;
        System.out.print("Enter your Name: ");

        userName = scanner.nextLine();

        System.out.println("Choose your Multiple Choice Question Set, The Options are:\n" +
                "1. Java Basics\n" +

                "2. Control Structures");
        qcs = scanner.nextInt();


                    Scanner sc = new Scanner(System.in);
                    File directoryPath = new File("G:\\File store");


                    String contents[] = directoryPath.list();
                    //  System.out.println("get my all files");
                    for (int i = 0; i < contents.length; i++) {
                        System.out.println(contents[i].split("\\.")[0]);



                        try {

                            switch (qcs) {
                                case 1:

                                    JavaSet set1 = new JavaSet();
                                    set1.logic();
                                    break;
                                case 2:

                                    ControlStructureSet set2 = new ControlStructureSet();
                                    set2.logic();
                                    break;
                                default:
                                    System.err.println("Invalid Option");
                                    break;
                            }


                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                }
}

















