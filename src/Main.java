import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        StartGame SG = new StartGame();
        try {
           SG.Strat();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void Lv_01_02(){

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int number = 3;
        String correct = "";
        int count = 0;
        int random = 0;
        int tryNum=0;

        String numCheck = "^[1-9]*$";

        while (true) {
            count++;
            random = (int) rd.nextInt(9) + 1;
            if (correct.contains(Integer.toString(random))) {
                count--;
                System.out.println(random);
            } else {
                correct += random;
            }
            if (count == number) {
                break;
            }
        }

        System.out.println(correct);
        while (true) {

            String answer = sc.nextLine();


            if (!answer.matches(numCheck)) {
                System.out.println("숫자만 입력해주세요");
                answer = sc.nextLine();
            } else {
                if(answer.length() == number) {
                    char num1;
                    char num2;
                    boolean flog = true;
                    for (int i = 0; i < answer.length(); i++) {
                        for (int j = i + 1; j < answer.length(); j++) {
                            num1 = answer.charAt(i);
                            num2 = answer.charAt(j);
                            System.out.println(answer.charAt(i));
                            System.out.println(answer.charAt(j));
                            if (num1 == num2) {
                                System.out.println("중복");
                                answer = sc.nextLine();
                                flog = false;
                                break;
                            }
                        }
                        if (flog == false) {
                            break;
                        }
                    }
                }else {
                    System.out.println("올바르지 않은 입력값입니다.");
                    answer = sc.nextLine();
                }
            }

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
                System.out.println("축하 합니다~");
                System.out.println("승리 하셨습니다!!");
                System.out.println("시도 횟수 : "+tryNum);
                break;
            }
        }
    }
}