public class Question {
    String question;
    String options;
    String correct;

    public Question(String question, String options, String correct) {
        this.question = question;
        this.options = options;
        this.correct = correct;
    }


    public String getQuestion() {
        return question;
    }

    public String getOptions() {
        return options;
    }

    public boolean checkAnswer(String input){
        if(input.toLowerCase().equals(this.correct)){
            return true;
        } else {
            return false;
        }
    }
}
