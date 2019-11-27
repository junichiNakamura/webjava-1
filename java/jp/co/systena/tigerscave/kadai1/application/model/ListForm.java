package jp.co.systena.tigerscave.kadai1.application.model;

import javax.validation.constraints.Size;

public class ListForm {

  @Size(max=10)         // 入力最大長
  private int itemId;

  public int getItemId() {
    return this.itemId;
  }
  public void setItemId(int itemId) {
    this.itemId = itemId;
  }
}
