package com.game;
import com.combat.PlayerCombatLogic;
import com.map.Map;

import java.util.*;

public class Player{

    //can't be changed so there's no setter
    private String name = "Jemad";
    //take out map?
    private Map map = new Map();
    private Items items = new Items();

    //so only unique items will be added on the players bag
    private Set<String> playerItems = new HashSet<>();

    //only uses a constructor with a map
    public Player(Map map){
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void attack(){
        System.out.println(name + " attacks");
    }

    //return list of items
    public String[] itemList(HashMap<String, String[]> map){
        String[] item = items.itemList(map);
        return item;
    }

    public void addItem(String item){
        playerItems.add(item);
    }

    public void removeItem(String item){
        playerItems.remove(item);
    }

    public Set<String> getPlayerItems() {
        return playerItems;
    }

    public Map map(){
        return map;
    }

    public static void legend(){
        PlayerCombatLogic.clearScreen();
        System.out.println("--------------------------Legend--------------------------");
        System.out.println("go + north/east/south/west: move around to different rooms\n");
        System.out.println("map: display map\n");
        System.out.println("fight + enemy: fight an opponent!\n");
        System.out.println("inspect: look around at your surroundings. also displays your items\n");
        System.out.println("talk + name: talk to friendly characters\n");
        System.out.println("get + item: add an item to your inventory\n");
        System.out.println("legend: display legend\n");
        System.out.println("quit: quit game\n");
        System.out.println("If you don't remember a command, try a synonym. It might just work!\n");
        System.out.println("----------------------Enter to Close----------------------");
        Scanner scanner = new Scanner(System.in);
        String startInput1 = scanner.nextLine();
        PlayerCombatLogic.clearScreen();
    }


    //test client main
    public static void main(String[] args) {

        Map map = new Map();
        Player player = new Player(map);

        player.itemList(player.map().room11Contents());
        String item = player.items.getItem(map.room11Contents(), "Pool Queue");

        player.addItem(item);

        System.out.println(player.getPlayerItems());

        System.out.println(Arrays.toString(player.map().newRoom11Items(item)));

    }
}



