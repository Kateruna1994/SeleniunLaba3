package pages;

import blocks.ProductWishListBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MyWishPage extends BasePage {

  private final By productContainer = By.xpath("//table//tbody//tr");


  public List<ProductWishListBlock> getMonitorsFromProductBlock() {
    List<ProductWishListBlock> products = new ArrayList<>();
    List<WebElement> containers = getDriver().findElements(productContainer);
    for (WebElement container : containers) {
      ProductWishListBlock productWishListBlock = new ProductWishListBlock(container);
      products.add(productWishListBlock);
    }
    return products;
  }

  public List<String> checkHowManyMonitorsAreInTheWishList() {
    List<ProductWishListBlock> products = getMonitorsFromProductBlock();
    List<String> product = new ArrayList<>();
    product.add(products.get(0).getImgMonitor1().getAttribute("title"));
    product.add(products.get(1).getImgMonitor2().getAttribute("title"));
    return product;
  }
}
