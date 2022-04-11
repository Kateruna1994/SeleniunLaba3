package pages;

import org.openqa.selenium.By;

public class ProductInfoPage extends BasePage {

  private final By clickButtonAdd = By.xpath(
      "//button[@type='button']/i[contains(@class,'fa fa-heart')]");
  private final By clickButton = By.id("wishlist-total");


  public ProductInfoPage clickButtonAddWishList() {
    find(clickButtonAdd).click();
    return this;
  }

  public MyWishPage clickButtonWishList() {
    find(clickButton).click();
    return new MyWishPage();
  }


}
