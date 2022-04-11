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

public class ProductWishListBlock {

  private WebElement imgMonitor1;
  private WebElement imgMonitor2;
  private String name;
  private String model;
  private String stock;
  private String price;
  private WebElement addToCart;
  private WebElement remove;


  public ProductWishListBlock(WebElement container) {

    try {
      this.imgMonitor1 = container.findElement(By.xpath("//a[contains(@href, 'id=42')]/img"));
    } catch (NoSuchElementException e) {
      this.imgMonitor1 = null;
    }

    try {
      this.imgMonitor2 = container.findElement(By.xpath("//a[contains(@href, 'id=33')]/img"));
    } catch (NoSuchElementException e) {
      this.imgMonitor2 = null;
    }

    try {
      this.name = container.findElement(By.xpath(".//td[2]")).getText();
    } catch (NoSuchElementException e) {
      this.name = null;
    }

    try {
      this.model = container.findElement(By.xpath(".//td[3]")).getText();
    } catch (NoSuchElementException e) {
      this.model = null;
    }

    try {
      this.stock = container.findElement(By.xpath(".//td[4]")).getText();
    } catch (NoSuchElementException e) {
      this.stock = null;
    }

    try {
      this.price = container.findElement(By.xpath(".//td[5]")).getText();
    } catch (NoSuchElementException e) {
      this.price = null;
    }

    try {
      this.addToCart = container.findElement(By.xpath(".//td/button"));
    } catch (NoSuchElementException e) {
      this.addToCart = null;
    }

    try {
      this.remove = container.findElement(By.xpath(".//tr//a//i"));
    } catch (NoSuchElementException e) {
      this.remove = null;
    }

  }

}
