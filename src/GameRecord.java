import java.util.HashMap;

public class GameRecord {
    HashMap<Integer, Integer> gameRecord = new HashMap<>();

    public void setGameRecord(Integer key, Integer number){
       gameRecord.put(key,number);
    }

    public HashMap<Integer, Integer> getGameRecord() {
        return gameRecord;
    }

    public void viweGameRecord(){
        for (Integer key : gameRecord.keySet()){
            System.out.println(key+"번째 게임 : 시도 횟수 - "+gameRecord.get(key));
        }
    }

    public void clear() {
        gameRecord.clear();
    }
}
