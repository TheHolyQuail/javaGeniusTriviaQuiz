import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        float score = 0;

        String[] questions = {"In the year 1900 in the U.S. what were the most popular first names given to boy and girl babies?",
                "When did the Liberty Bell get its name?",
                "In the Roy Rogers -Dale Evans Museum, you will find Roy and Dales stuffed horses. Roy's horse was named Trigger, which was Dales horse?",
                "The Daniel Boon museum at the home where he died can best be described how?",
                "Which of the following items was owned by the fewest U.S. homes in 1990?",
                "Who holds the record for the most victories in a row on the professional golf tour?",
                "Who is third behind Hank Aaron and Babe Ruth in major league career home runs?",
                "In 1990, in what percentage of U.S. married couples did the wife earn more money than the husband?",
                "During the 1980s for six consecutive years what breed of dog was the most popular in the U.S.?",
                "In 1985, five percent of U.S. households had telephone answering machines. By 1990 what percentage of homes had answering machines?"};
        String[] options = {"A. William and Elizabeth B. Joseph and Catherine C. John and Mary D. George and Anne",
                "A. when it was made, in 1701 B. when it rang on July 4, 1776 C. in the 19th century, when it became a symbol of the abolition of slavery D. none of the above",
                "A. Buttermilk B. Daisy C. Scout D. Tulip",
                "A. a log cabin in Kentucky B. a two-story clapboard house in Tennessee C. a four-story Georgian-style home in Missouri D. a three story brick house in Arkansas",
                "A. home computer B. compact disk player C. cordless phone D. dishwasher",
                "A. Jack Nicklaus B. Arnold Palmer C. Byron Nelson D. Ben Hogan",
                "A. Reggie Jackson B. Harmon Killebrew C. Willie Mays D. Frank Robinson",
                "A. 8 B. 18 C. 38 D. 58",
                "A. cocker spaniel B. German shepherd C. Labrador retriever D. poodle",
                "A. 10 percent B. 15 percent C. 31 percent D. 51 percent"};
        String[] answer = {"c", "c", "a", "c", "b", "c", "c", "b", "a", "c"};
        Question[] q = new Question[questions.length];

        System.out.println("Welcome to the 2019 USA genius quiz!");
        System.out.println("Answer each of the "+ questions.length +" questions by imputing the letter in front of the answer you think is correct (not case sensitive!)");
        System.out.println("Your genius score will be calculated at the end!");
        System.out.println("Good luck!");

        for (int i = 0; i < questions.length; i++) {
            Question question = new Question(questions[i], options[i], answer[i]);
            q[i] = question;
        }

        for (int ii = 0; ii < questions.length; ii++) {
            System.out.println("Question " + (ii + 1) + ":");
            System.out.println(q[ii].getQuestion());
            System.out.println(q[ii].getOptions());
            System.out.println(":");
            Scanner userInput = new Scanner(System.in);
            String input = userInput.nextLine();
            if(q[ii].checkAnswer(input)){
                score++;
            }
        }

        System.out.println("Your genius score is " + ((score / questions.length) * 442.2) + "!");
    }
}

/////////////////////////
//QUESTIONS AND ANSWERS//
/////////////////////////
//
//In the year 1900 in the U.S. what were the most popular first names given to boy and girl babies?
//A. William and Elizabeth B. Joseph and Catherine C. John and Mary D. George and Anne
//
//When did the Liberty Bell get its name?
//A. when it was made, in 1701 B. when it rang on July 4, 1776 C. in the 19th century, when it became a symbol of the abolition of slavery D. none of the above
//
//In the Roy Rogers -Dale Evans Museum, you will find Roy and Dales stuffed horses. Roy's horse was named Trigger, which was Dales horse?
//A. Buttermilk B. Daisy C. Scout D. Tulip
//
//The Daniel Boon museum at the home where he died can best be described how?
// A. a log cabin in Kentucky B. a two-story clapboard house in Tennessee C. a four-story Georgian-style home in Missouri D. a three story brick house in Arkansas
//
//Which of the following items was owned by the fewest U.S. homes in 1990?
//A. home computer B. compact disk player C. cordless phone D. dishwasher
//
//Who holds the record for the most victories in a row on the professional golf tour?
//A. Jack Nicklaus B. Arnold Palmer C. Byron Nelson D. Ben Hogan
//
//Who is third behind Hank Aaron and Babe Ruth in major league career home runs?
//A. Reggie Jackson B. Harmon Killebrew C. Willie Mays D. Frank Robinson
//
//In 1990, in what percentage of U.S. married couples did the wife earn more money than the husband?
//A. 8 B. 18 C. 38 D. 58
//
//During the 1980s for six consecutive years what breed of dog was the most popular in the U.S.?
//A. cocker spaniel B. German shepherd C. Labrador retriever D. poodle.
//
//In 1985, five percent of U.S. households had telephone answering machines. By 1990 what percentage of homes had answering machines?
//A. 10 percent B. 15 percent C. 31 percent D. 51 percent
//
//C. John and Mary
//C. in the 19th century, when it became a symbol of the abolition of slavery
//A. Buttermilk
//C. a four-story Georgian-style home in Missouri
//B. compact disk player
//C. Byron Nelson
//C. Willie Mays
//B. 18
//A. cocker spaniel
//C. 31 percent