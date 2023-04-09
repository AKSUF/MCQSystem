import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class JavaSet extends JavaSetQuestions{

    Scanner sc = new Scanner(System.in);
    int correctAnsCount= 0;
    int wrongAnsCount= 0;
    public void logic () {

            Map<Questions, Character> hmap = new HashMap<>();
            hmap.put(q1, 'c');
            hmap.put(q2, 'd');
            hmap.put(q3, 'b');
            hmap.put(q4, 'b');
            hmap.put(q5, 'c');
            hmap.put(q6, 'b');
            hmap.put(q7, 'b');
            hmap.put(q8, 'b');
            hmap.put(q9, 'c');
            hmap.put(q10, 'd');

            for (Map.Entry<Questions, Character> map : hmap.entrySet()) {
                System.out.println("\n" + map.getKey().getQuestion());
                System.out.println(map.getKey().getOption1());
                System.out.println(map.getKey().getOption2());
                System.out.println(map.getKey().getOption3());
                System.out.println(map.getKey().getOption4());

                System.out.print("Your Answer is: ");
                Character ans = sc.next().charAt(0); // Reading first char from the user only

                int cans = Character.compare(ans, map.getValue());

                if (cans == 0) {
                    System.out.println("Correct Answer" + "\n");
                    correctAnsCount++;
                } else {
                    System.out.println("Wrong Answer! The Correct Answer is : " + map.getValue());
                    wrongAnsCount++;
                }
            }

            int percentage = (100 * correctAnsCount) / hmap.size();
            System.out.println("Learner, " + "You answered "
                    + correctAnsCount + " Questions Right, "
                    + wrongAnsCount + " Questions Wrong " +
                    "for a Total of " + hmap.size() + " Questions.");
            System.out.println("You scored " + percentage + "%");
    }

    @Override
    public String toString() {
        return "JavaSet{" +
                "q1=" + q1 +
                ", q2=" + q2 +
                ", q3=" + q3 +
                ", q4=" + q4 +
                ", q5=" + q5 +
                ", q6=" + q6 +
                ", q7=" + q7 +
                ", q8=" + q8 +
                ", q9=" + q9 +
                ", q10=" + q10 +
                '}';
    }

}
