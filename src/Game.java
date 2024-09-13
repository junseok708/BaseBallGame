
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    GameAnswer gameAnswer =new GameAnswer();
    GameRecord gameRecord = new GameRecord();
    Valid valid = new Valid();

    private int tryNum = 0;


    public void start(String correct,Integer number){
        System.out.println("< 게임을 시작 합니다 >");
        System.out.println(number+"자리 숫자를 입력 해주세요");

        while (true) {
            String answer = sc.nextLine();
            if (valid.check(answer, number)) {
                if (!answer.equals(correct)) {
                    int strikeCount = 0;
                    int bollCount = 0;
                    System.out.println(answer);
                    for (int i = 0; i < answer.length(); i++) {
                        for (int j = 0; j < correct.length(); j++) {
                            if (correct.charAt(j) == answer.charAt(i)) {
                                if (j == i) {
                                    strikeCount++;
                                } else {
                                    bollCount++;
                                }
                            }
                        }
                    }
                    if (strikeCount == 0 && bollCount == 0) {
                        tryNum++;
                        System.out.println("Out!!");
                    } else {
                        tryNum++;
                        System.out.println("스크라이크 : " + strikeCount);
                        System.out.println("볼 : " + bollCount);
                    }
                } else {
                    tryNum++;
                    System.out.println("축하 합니다~");
                    System.out.println("승리 하셨습니다!!");
                    System.out.println("시도 횟수 : " + tryNum);
                    System.out.println("================");
                    gameAnswer.setAnswer("");
                    break;
                }
            }
        }
    }

    public void setTryNum(int tryNum) {
        this.tryNum = tryNum;
    }

    public int getTryNum() {
        return tryNum;
    }
}
