package jp.co.systena.tigerscave.kadai1.application.service;

import java.util.HashMap;
import java.util.Map;
import jp.co.systena.tigerscave.kadai1.application.model.Item;
public class ListService {
  public static Map<Integer, Item> getItemList() {
    Map<Integer, Item> itemList = new HashMap<Integer, Item>();
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();

    item1.setItemId(1);
    item1.setName("キーボード");
    item1.setPrice(1000);
    int itemId = item1.getItemId();
    itemList.put(itemId, item1);

    item2.setItemId(2);
    item2.setName("ノートパソコン");
    item2.setPrice(100000);
    itemId = item2.getItemId();
    itemList.put(itemId, item2);

    item3.setItemId(3);
    item3.setName("マウス");
    item3.setPrice(300);
    itemId = item3.getItemId();
    itemList.put(itemId, item3);
    return itemList;

  }
}