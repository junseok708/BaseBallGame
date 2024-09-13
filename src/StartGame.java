import java.util.Scanner;

public class StartGame {
    Scanner sc = new Scanner(System.in);
    Game game = new Game();

    public void Strat() throws InterruptedException {
        while (true) {
            Setting();
            String number = sc.nextLine();
            switch (number){
                case "1" :
                    System.out.println("< 게임 시작>");
                    String correct = game.correct();
                    game.strat(correct);
                    break;
                case "2" :
                    System.out.println("< 게임 기록 보기 >");
                    break;
                case "3" :
                    System.out.println("< 종료하기 >");

                    Thread.sleep(1000);
                    System.out.println("= 3 =");
                    Thread.sleep(1000);
                    System.out.println("= 2 =");
                    Thread.sleep(1000);
                    System.out.println("= 1 =");
                    Thread.sleep(1000);
                    System.out.println("= 시스템을 종료합니다 =");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다!");
                    System.out.println("다시 입력해주세요.");
            }
        }

    }

    public void Setting() {
        System.out.println("< 숫자 야구 게임 >");
        System.out.println("환영합니다!");
        System.out.println("원하시는 번호를 입력해주세요");
        System.out.println("1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기");
    }
}
