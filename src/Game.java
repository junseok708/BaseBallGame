
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    GameAnswer gameAnswer = new GameAnswer();
    GameRecord gameRecord = new GameRecord();
    Valid valid = new Valid();

    //몇번 시도했는지 트라이 변수
    private int tryNum = 0;

    //게임 시작
    public void start(String correct, Integer number) {
        // 안내 출력
        System.out.println("< 게임을 시작 합니다 >");
        System.out.println(number + "자리 숫자를 입력 해주세요");

        while (true) {
            //정답 입력 부분
            String answer = sc.nextLine();
            if (valid.check(answer, number)) {
                //정답수와 다른경우
                if (!answer.equals(correct)) {
                    int strikeCount = 0;
                    int bollCount = 0;

                    //스트라이크와 볼이 몇게인지 수를 세는 검사 부분
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
                    // 스트라이크와 볼 둘다 없을 경우 예외처리
                    if (strikeCount == 0 && bollCount == 0) {
                        tryNum++;
                        System.out.println("Out!!");
                    } else {
                        // 검사를 통해 맞은 갯수 출력
                        tryNum++;
                        System.out.println("스크라이크 : " + strikeCount);
                        System.out.println("볼 : " + bollCount);
                    }

                } else {
                    //승리시 나오는 맨트 출력
                    tryNum++;
                    System.out.println("================");
                    System.out.println("축하 합니다~");
                    System.out.println("승리 하셨습니다!!");
                    System.out.println();
                    System.out.println("시도 횟수 : " + tryNum);
                    System.out.println("================");
                    //정답수 초기화
                    gameAnswer.setAnswer("");
                    break;
                }
            }
        }
    }
// 기록을 위한 getter,setter
    public void setTryNum(int tryNum) {
        this.tryNum = tryNum;
    }

    public int getTryNum() {
        return tryNum;
    }
}
