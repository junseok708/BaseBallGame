import java.util.HashMap;

// 게임 기록 클레스
public class GameRecord {
    //맵을 통해 쉽게 기록
    private final HashMap<Integer, Integer> gameRecord = new HashMap<>();

    //setter 기록 입력
    public void setGameRecord(Integer key, Integer number){
       gameRecord.put(key,number);
    }

    //기록물 출력
    public void viweGameRecord(){
        for (Integer key : gameRecord.keySet()){
            System.out.println(key+"번째 게임 : 시도 횟수 - "+gameRecord.get(key));
        }
    }
    //기록물 지우기
    public void clear() {
        gameRecord.clear();
    }
}
