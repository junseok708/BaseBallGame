import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int number = 3;
        String correct = "";
        int count = 0;
        int random = 0;

        while (true){
            count++;
            random = (int) rd.nextInt(9) + 1;
            if(correct.contains(Integer.toString(random))){
                count--;
                System.out.println(random);
            }else {
                correct+=random;
            }
            if(count==number){
                break;
            }
        }

        System.out.println(correct);

        String answer = sc.nextLine();
        if (!answer.equals(correct)) {

            int strikeCount = 0;
            int bollCount = 0;
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
                System.out.println("Out!!");
            } else {
                System.out.println("스크라이크 : " + strikeCount);
                System.out.println("볼 : " + bollCount);
            }
        } else {
            System.out.println("축하 합니다~");
            System.out.println("승리 하셨습니다!!");
        }


    }
}