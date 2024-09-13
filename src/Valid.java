public class Valid {

    String numCheck = "^[1-9]*$";

    public boolean check(String answer, int number) {
        boolean check = false;
        if (!answer.matches(numCheck)) {
            System.out.println("숫자만 입력해주세요");
        } else {
            if (answer.length() == number) {
                char num1;
                char num2;
                boolean flog = true;
                for (int i = 0; i < answer.length(); i++) {
                    for (int j = i + 1; j < answer.length(); j++) {
                        num1 = answer.charAt(i);
                        num2 = answer.charAt(j);
                        if (num1 == num2) {
                            System.out.println("중복 입니다");
                            check = false;
                            flog = false;
                            break;
                        } else {
                            check = true;
                        }
                    }
                    if (flog == false) {
                        break;
                    }
                }
            } else {
                System.out.println("올바르지 않은 입력값입니다.");
            }
        }
        return check;
    }
}
