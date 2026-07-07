import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] userSelections = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the size of int ?", "2", "4", "6", "8", "4");
        questions[1] = new Question(2, "What is the size of double ?", "2", "4", "6", "8", "8");
        questions[2] = new Question(3, "What is the size of char ?", "2", "4", "6", "8", "2");
        questions[3] = new Question(4, "What is the size of long ?", "2", "4", "6", "8", "8");
        questions[4] = new Question(5, "What is the size of boolean ?", "2", "1", "6", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println(question.getId() + ") " + question.getQuestion());
            System.out.println("A) " + question.getOption1());
            System.out.println("B) " + question.getOption2());
            System.out.println("C) " + question.getOption3());
            System.out.println("D) " + question.getOption4());

            Scanner scanner = new Scanner(System.in);
            userSelections[i] = scanner.nextLine();
            i++;

            System.out.println();
        }

        System.out.println("Your Selections:");
        for (String userSelection : userSelections) {
            System.out.println(userSelection);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getAnswer().equals(userSelections[i])) {
                score++;
            }
        }

        System.out.println("Your Score is: " + score);
    }
}
