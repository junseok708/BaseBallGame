import java.util.Scanner;

public class StartGame {
    Scanner sc = new Scanner(System.in);
    Game game = new Game();

    int count=0;
    public void start(){
        while (true) {
            setting();
            String number = sc.nextLine();
            int level =3;
            switch (number){
                case "0" :
                    System.out.println("< 난이도 조절>");
                    while (true) {
                        levelSetting();
                        String gameLevel = sc.nextLine();
                        switch (gameLevel) {
                            case "1":
                                level = 3;
                                System.out.println(gameLevel+"단계 난이도가 선택되었습니다");
                                break;
                            case "2":
                                level = 4;
                                System.out.println(gameLevel+"단계 난이도가 선택되었습니다");
                                break;
                            case "3":
                                level = 5;
                                System.out.println(gameLevel+"단계 난이도가 선택되었습니다");
                                break;
                            default:
                                System.out.println("다시 선택해주세요");
                                level = -1;
                        }
                        if(level>0) {
                            break;
                        }
                    }
                    game.start(game.gameAnswer.randomAnswer(level),level);
                    count++;
                    game.gameRecord.setGameRecord(count, game.getTryNum());
                    game.setTryNum(0);
                    break;
                case "1" :
                    System.out.println("< 게임 시작>");
                    game.start(game.gameAnswer.randomAnswer(level),level);
                    count++;
                    game.gameRecord.setGameRecord(count, game.getTryNum());
                    game.setTryNum(0);
                    break;
                case "2" :
                    System.out.println("< 게임 기록 보기 >");
                    game.gameRecord.viweGameRecord();
                    break;
                case "3" :
                    System.out.println("= 시스템을 종료합니다 =");
                    game.gameRecord.clear();
                    break;
                default:
                    System.out.println("잘못된 입력입니다!\n다시 입력해주세요");

            }

        }

    }

    public void setting() {
        System.out.println("< 숫자 야구 게임 >");
        System.out.println("환영합니다!");
        System.out.println("원하시는 번호를 입력해주세요");
        System.out.println("0. 난이도 조절  1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기");
    }

    public void levelSetting(){
        System.out.println("난이도를 선택해주세요");
        System.out.println("1단계 : 3자리숫자 / 2단계 : 4자리 숫자 / 3단계 : 5자리 숫자 ");
    }
}
