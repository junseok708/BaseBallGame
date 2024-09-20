public class Valid {
    //숫자 정규식
    private final String numCheck = "^[1-9]*$";

    //숫자만 있는지 검사
    public boolean check(String answer, int number) {
        boolean check = false;
        //정규식과 비교 숫자가 아닐때
        if (!answer.matches(numCheck)) {
            System.out.println("숫자만 입력해주세요");
        } else {
            //입력 받은 숫자의 길이 검사
            if (answer.length() == number) {
                char num1;
                char num2;
                boolean flog = true;
                //입력 받은 숫자의 중복 검사
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
                //기타 다른 입력을 했을시 예외 처리
                System.out.println("올바르지 않은 입력값입니다.");
            }
        }
        //검사을 통과한 했을시 참 거짓으로 확인
        return check;
    }
}
