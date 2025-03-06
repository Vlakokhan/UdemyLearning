public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1,"size of int", "2" ,"6" , "8", "4", "4");
        questions[1] = new Question(2, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Venus", "Jupiter", "Mars", "Mars");
        questions[3] = new Question(4, "How many continents are there on Earth?", "5", "6", "7", "8", "7");
        questions[4] = new Question(5, "What is the result of 5 + 3 * 2?", "11", "16", "10", "8", "11");

    }

    public void displayQuestions() {
       for (Question q : questions){
           System.out.println("Question "+ q);
       }

    }
}
