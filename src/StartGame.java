import java.util.Scanner;

public class StartGame {
    Scanner sc = new Scanner(System.in);
    Game game = new Game();

    //몇번 시작했는지 카운트 하는 변수
   private int count = 0;

    //시작 메서드
    public void start() {
        //게임이 끝날때 까지 반복
        while (true) {
            //먼처 출력되는 안내 메서드
            setting();
            String number = sc.nextLine();

            //기본난이도
            int level = 3;

            switch (number) {
                case "0":
                    System.out.println("< 난이도 조절>");

                    while (true) {
                        //난이도 조절시 안내 출력 메소드
                        levelSetting();
                        //선택을 위한 입력을 받는 부분
                        String gameLevel = sc.nextLine();
                        switch (gameLevel) {
                            case "1":
                                level = 3;
                                System.out.println(gameLevel + "단계 난이도가 선택되었습니다");
                                break;

                            case "2":
                                level = 4;
                                System.out.println(gameLevel + "단계 난이도가 선택되었습니다");
                                break;

                            case "3":
                                level = 5;
                                System.out.println(gameLevel + "단계 난이도가 선택되었습니다");
                                break;

                            default:
                                System.out.println("다시 선택해주세요");
                                level = -1;
                        }

                        if (level > 0) {
                            break;
                        }
                    }
                    // 난이도 조절 게임 시작 부분
                    game.start(game.gameAnswer.randomAnswer(level), level);// 매개변수로 받은 난이도을 통해 랜덤 수 생성
                    count++; //몇번깨 인지 기록
                    game.gameRecord.setGameRecord(count, game.getTryNum());//몇번 시도를 했는지 기록
                    game.setTryNum(0);//트라이 기록 초기화
                    break;

                case "1": // 기본 난이도
                    System.out.println("< 게임 시작>");
                    game.start(game.gameAnswer.randomAnswer(level), level);
                    count++;
                    game.gameRecord.setGameRecord(count, game.getTryNum());
                    game.setTryNum(0);
                    break;

                case "2": // 게임 기록 몇번 째에 몇번 시도했는지
                    System.out.println("< 게임 기록 보기 >");
                    game.gameRecord.viweGameRecord();
                    break;

                case "3":// 시스템 종료시 기록 삭제
                    System.out.println("= 시스템을 종료합니다 =");
                    game.gameRecord.clear();
                    break;

                default: // 다른 입력일시 예외처리
                    System.out.println("잘못된 입력입니다!\n다시 입력해주세요");

            }

        }

    }

    //안내 출력 메서드
    public void setting() {
        System.out.println("< 숫자 야구 게임 >");
        System.out.println("환영합니다!");
        System.out.println("원하시는 번호를 입력해주세요");
        System.out.println("0. 난이도 조절  1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기");
    }

    //난이도 조절시 안내 출력 메소드
    public void levelSetting() {
        System.out.println("난이도를 선택해주세요");
        System.out.println("1단계 : 3자리숫자 / 2단계 : 4자리 숫자 / 3단계 : 5자리 숫자 ");
    }
}
