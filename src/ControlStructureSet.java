import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ControlStructureSet extends ControlStructureSetQuestions{
    Scanner sc = new Scanner(System.in);
    int correctAnsCount= 0;
    int wrongAnsCount= 0;

    public void logic () throws FileNotFoundException {


        try {
            Map<Questions, Character> hmap = new HashMap<>();
            hmap.put(q1,'b');
            hmap.put(q2, 'c');
            hmap.put(q3, 'd');
            hmap.put(q4, 'b');
            hmap.put(q5, 'b');
            hmap.put(q6, 'd');
            hmap.put(q7, 'a');
            hmap.put(q8, 'c');
            hmap.put(q9, 'b');
            hmap.put(q10, 'c');

            for (Map.Entry<Questions, Character> map : hmap.entrySet()) {
                System.out.println("\n" +map.getKey().getQuestion());
                System.out.println(map.getKey().getOption1());
                System.out.println(map.getKey().getOption2());
                System.out.println(map.getKey().getOption3());
                System.out.println(map.getKey().getOption4());

                System.out.print("Your Answer is: ");
                Character ans = sc.next().charAt(0);

                int cans = Character.compare(ans, map.getValue());

                if (cans == 0) {
                    System.out.println("Correct Answer"+"\n");
                    correctAnsCount++;
                } else {
                    System.out.println("Wrong Answer! The Correct Answer is : " +map.getValue());
                    wrongAnsCount++;
                }
            }

            int percentage = (100 * correctAnsCount) / hmap.size();

            System.out.println("Learner, " + "You answered "
                    + correctAnsCount + " Questions Right, "
                    + wrongAnsCount + " Questions Wrong " +
                    "for a Total of " + hmap.size() + " Questions.");
            System.out.println("You scored " + percentage + "%");

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
