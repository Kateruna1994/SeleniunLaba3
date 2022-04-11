package blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ProductMainPageBlock {
//div[contains(@class,'product-thumb')]

  private WebElement img;
  private WebElement nameAsWebElement;
  private String nameAsString;
  private String price;
  private String oldPrice;
  private String newPrice;
  private String taxPrice;
  private WebElement addToCart;
  private WebElement addToWishList;
  private WebElement compareThisProduct;


  public ProductMainPageBlock(WebElement container) {

    try {
      this.img = container.findElement(By.xpath("div[@class='image']"));
    } catch (NoSuchElementException e) {
      this.img = null;
    }

    try {
      this.nameAsWebElement = container.findElement(By.xpath("//div[@class='caption']//a"));
      this.nameAsString = nameAsWebElement.getAttribute("text");
    } catch (NoSuchElementException e) {
      this.nameAsWebElement = null;
      this.nameAsString = null;
    }

    try {
      this.price = container.findElement(By.xpath(".//p[@class='price']")).getText().trim();
    } catch (NoSuchElementException e) {
      this.price = null;
    }

    try {
      this.oldPrice = container.findElement(
          By.xpath("//p[@class='price']/span[@class='price-old']")).getText();
    } catch (NoSuchElementException e) {
      this.oldPrice = null;
    }

    try {
      this.newPrice = container.findElement(
          By.xpath("//p[@class='price']/span[@class='price-new']")).getText();
    } catch (NoSuchElementException e) {
      this.newPrice = null;
    }

    try {
      this.taxPrice = container.findElement(
          By.xpath("//p[@class='price']/span[@class='price-tax']")).getText();
    } catch (NoSuchElementException e) {
      this.taxPrice = null;
    }

    try {
      this.addToCart = container.findElement(
          By.xpath("//button/i[contains(@class,'fa-shopping-cart')]"));
    } catch (NoSuchElementException e) {
      this.addToCart = null;
    }

    try {
      this.addToWishList = container.findElement(By.xpath("//i[contains(@class,'fa-heart')]"));
    } catch (NoSuchElementException e) {
      this.addToWishList = null;
    }

    try {
      this.compareThisProduct = container.findElement(
          By.xpath("//i[contains(@class,'fa-exchange')]"));
    } catch (NoSuchElementException e) {
      this.compareThisProduct = null;
    }
  }

}
