import java.util.Scanner;

public class Main {
    public static void main(String[] data) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hero data (name level):");
        String name = scanner.next();
        int level = scanner.nextInt();
        Character hero = new Character(name, level);
        MonsterList monsterList = new MonsterList();
        loadMonster(monsterList);
        while (monsterList.isMonsterLeft()) {
            Character monster = monsterList.getMonster();
            System.out.println("FIGHT!!");
            System.out.println(hero.toString() + " / " + monster.toString());
            while (true) {
                System.out.println("use spell/weapon (1/2):");
                String choose = scanner.next();
                char type = 's';
                if (choose.equals("1") || choose.equals("s") || choose.equals("S")) {
                    type = 's';
                } else if (choose.equals("2") || choose.equals("w") || choose.equals("W")) {
                    type = 'w';
                }
                hero.attack(monster, type);
                System.out.println(monster.toString());
                if (monster.isDead() || hero.isDead())
                    break;
                System.out.println(monster.getName() + "  Attack!!!");
                monster.attack(hero, 's');
                System.out.println(hero.toString());
                if (monster.isDead() || hero.isDead())
                    break;

            }
            if (monster.isDead()) {
                hero.levelUp();
                System.out.println(monster.getName() + " died");
                System.out.println(hero.getName() + " LevelUP!!");
                hero.refresh();
                System.out.println(hero.toString());
                if (monsterList.isMonsterLeft()) {
                    System.out.println("Continue(Y=1):");
                    String select = scanner.next();
                    if (select.equals("1") || select.equals("Y") || select.equals("y")) {
                        continue;
                    } else {
                        break;
                    }
                }
                else {
                    System.out.println("--You Win--" + "\n" + "monsters all died");
                    break;
                }
            }

            if (hero.isDead()) {
                System.out.println(hero.getName() + " died" + "\n---Game Over---");
                break;
            }

        }
        System.out.println("See you");
    }

    private static void loadMonster(MonsterList monsterList) {
        monsterList.addMonster(new Character("Pika", 5));
        monsterList.addMonster(new Character("Git", 10));
        monsterList.addMonster(new Character("Cat", 15));
        monsterList.addMonster(new Character("Negi", 20));
        monsterList.addMonster(new Character("Kitty", 30));
        monsterList.addMonster(new Character("Doomsayer", 45));
    }
}

