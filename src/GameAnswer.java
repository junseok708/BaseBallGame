import java.util.Random;

public class GameAnswer {
    Random rd = new Random();

    private String answer = "";

    public String randomAnswer(int num) {
        int count = 0;
        while (count<num) {
            int random = (int) rd.nextInt(9) + 1;
            if (!answer.contains(Integer.toString(random))) {
                answer += Integer.toString(random);
                count++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
