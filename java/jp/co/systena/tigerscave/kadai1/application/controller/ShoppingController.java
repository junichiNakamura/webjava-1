package jp.co.systena.tigerscave.kadai1.application.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.kadai1.application.model.Item;
import jp.co.systena.tigerscave.kadai1.application.model.ListForm;
import jp.co.systena.tigerscave.kadai1.application.service.ListService;

// Viewなし。jsonやxmlを返却するアノテーション
@RestController
public class ShoppingController {
  public Map<Integer, Item> list() {
    Map<Integer, Item> map = new HashMap<Integer, Item>();
    map = ListService.getItemList();
    return map; // 商品情報が格納されたmapを返却
  }

  @RequestMapping(value = "/list") // URLとのマッピング
  public ModelAndView display(ModelAndView mnv) {
    mnv.addObject("data", list());
    mnv.setViewName("list");
    return mnv;
  }

  @RequestMapping("/cart") // URLとのマッピング
  public ModelAndView Order(ModelAndView mnv, HttpSession session, Model model,
    @RequestParam(name = "itemId") Integer itemId) {
    ListForm listForm = new ListForm();
    listForm.setItemId(itemId);
    mnv.addObject("data", list().get(itemId));
    mnv.setViewName("cart");
    // Viewのテンプレート名を返す
    return mnv;
  }
}
