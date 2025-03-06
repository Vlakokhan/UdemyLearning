import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "8", "4", "4");
        questions[1] = new Question(2, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Venus", "Jupiter", "Mars", "Mars");
        questions[3] = new Question(4, "How many continents are there on Earth?", "5", "6", "7", "8", "7");
        questions[4] = new Question(5, "What is the result of 5 + 3 * 2?", "11", "16", "10", "8", "11");

    }

    String[] selections = new String[5];

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            i++;
        }
        for (String s : selections) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selections[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is " + score);
    }
}
