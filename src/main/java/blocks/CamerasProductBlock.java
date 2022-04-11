package blocks;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class CamerasProductBlock {

  private WebElement img;
  private WebElement nameWebElement;
  private String nameString;
  private String priceNew;
  private String priceOld;
  private String priceTax;
  private WebElement addToCart;
  private WebElement addToWishList;
  private WebElement compareThisProducts;

  public CamerasProductBlock(WebElement container) {
    try {
      this.img = container.findElement(By.xpath(".//img"));
    } catch (NoSuchElementException e) {
      this.img = null;
    }

    try {
      this.nameWebElement = container.findElement(By.xpath(".//div[@class='caption']//a"));
      this.nameString = nameWebElement.getText();
    } catch (NoSuchElementException e) {
      this.nameWebElement = null;
      this.nameString = null;
    }

    try {
      this.priceNew = container.findElement(
          By.xpath(".//p[@class='price']/span[@class='price-new']")).getText();
    } catch (NoSuchElementException e) {
      this.priceNew = null;
    }

    try {
      this.priceOld = container.findElement(
          By.xpath(".//p[@class='price']/span[@class='price-old']")).getText();
    } catch (NoSuchElementException e) {
      this.priceOld = null;
    }

    try {
      this.priceTax = container.findElement(
          By.xpath(".//p[@class='price']/span[@class='price-tax']")).getText();
    } catch (NoSuchElementException e) {
      this.priceTax = null;
    }

    try {
      this.addToCart = container.findElement(
          By.xpath(".//button/i[contains(@class,'fa-shopping-cart')]"));
    } catch (NoSuchElementException e) {
      this.addToCart = null;
    }

    try {
      this.addToWishList = container.findElement(
          By.xpath(".//button/i[contains(@class,'fa-heart')]"));
    } catch (NoSuchElementException e) {
      this.addToWishList = null;
    }

    try {
      this.compareThisProducts = container.findElement(
          By.xpath(".//button/i[contains(@class,'fa-exchange')]"));
    } catch (NoSuchElementException e) {
      this.compareThisProducts = null;
    }
  }

}
