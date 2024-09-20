import java.util.Random;

//랜덤한 정답수 만드는 클래스
public class GameAnswer {
    Random rd = new Random();
    //랜덤 정답수을 담는 변수
    private String answer = "";

    //랜덤 정답수를 만드는 메서드
    public String randomAnswer(int num) {
        //자리수를 고정하는 변수
        int count = 0;
        //자리수만큼 반복해 랜덤한 정답수를 만드는 반복문
        while (count < num) {
            int random = (int) rd.nextInt(9) + 1;
            if (!answer.contains(Integer.toString(random))) {
                answer += Integer.toString(random);
                count++;
            }
        }
        System.out.println(answer);
        //랜덤 정답수 리턴
        return answer;
    }
    //초기화를 위한 setter
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
