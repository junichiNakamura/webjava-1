package jp.co.systena.tigerscave.kadai1.application.model;

public class Item {

  private int itemId;
  private String name;
  private int price;


  // getter
  public int getItemId() {
    return this.itemId;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  // setter
  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}