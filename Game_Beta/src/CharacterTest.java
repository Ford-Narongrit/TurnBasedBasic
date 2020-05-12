import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
//    @Description("monster level 100 attack hero level 79")
    @DisplayName("monster level 100 attack hero level 79 เหลือเลือด 426.9")
    @Test
    void attack1(){
        Character monster = new Character("Boss", 100);
        Character hero = new Character("ford", 79);
        monster.attack(hero, 'w');
        assertEquals(426.9, hero.getLifepoint());

    }
    @DisplayName("เพิ่มlevel ตัวละครจาก 10 ถึง 11")
    @Test
    void levelUphero(){
        Character hero = new Character("ford", 10);
        hero.levelUp();
        assertEquals(11, hero.getLevel());
    }

}