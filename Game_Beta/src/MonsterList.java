import java.util.ArrayList;

public class MonsterList {
    //arraylist
    private ArrayList<Character> monsters;
    public MonsterList(){
        monsters = new ArrayList<>();
    }

    public void addMonster (Character monster){
        monsters.add(monster);
    }

    public Character getMonster (){
        if (monsters.size() > 0)
            return monsters.remove(0);
        return null;
    }

    public boolean isMonsterLeft (){
        return !monsters.isEmpty();
    }
}
