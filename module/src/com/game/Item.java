package com.game;

import com.readjson.ReadItemContentJson;
import org.json.simple.JSONObject;

public class Item {
    private String itemName;
    private String itemType;
    private int itemAffect;

    public Item(String itemName) {
        setItemName(itemName);
        setItemType();
        setItemAffect();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        // retrieve the types of the item from JSON
        // JSONArray itemJSONData = ReadItemContentJson.()
        return itemType;
    }

    public void setItemType() {
        JSONObject itemObjJson = ReadItemContentJson.getItemBasedOnItemName(this.getItemName());
        String itemType = String.valueOf(itemObjJson.get("type"));
        this.itemType = itemType;
    }

    public int getItemAffect() {

        return itemAffect;
    }

    public void setItemAffect() {
        JSONObject itemObjJson = ReadItemContentJson.getItemBasedOnItemName(this.getItemName());
        String itemEffectString = String.valueOf(itemObjJson.get("effect"));
        int effectAmount = Integer.parseInt(itemEffectString);
        this.itemAffect = effectAmount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemAffect=" + itemAffect +
                '}';
    }
}
