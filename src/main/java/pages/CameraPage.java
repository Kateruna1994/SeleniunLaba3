package pages;

import blocks.CamerasProductBlock;
import blocks.ProductWishListBlock;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class CameraPage extends BasePage {

  private final By productContainerCameras = By.xpath("//div[@class='product-thumb']");


  public List<CamerasProductBlock> getCamerasFromCameraPage() {
    List<CamerasProductBlock> products = new ArrayList<>();
    List<WebElement> containers = getDriver().findElements(productContainerCameras);
    for (WebElement container : containers) {
      CamerasProductBlock camerasProductBlock = new CamerasProductBlock(container);
      products.add(camerasProductBlock);
    }
    return products;
  }

  public double getOldPrice(String nameProduct) {
    List<CamerasProductBlock> products = getCamerasFromCameraPage();
    for (CamerasProductBlock product : products) {
      if (product.getNameString().equals(nameProduct)) {
        String oldPrice = product.getPriceOld().substring(1);
        return Double.parseDouble(oldPrice);
      }
    }
    return 0;
  }

  public double getNewPrice(String nameProduct) {
    List<CamerasProductBlock> products = getCamerasFromCameraPage();
    for (CamerasProductBlock product : products) {
      if (product.getNameString().equals(nameProduct)) {
        String newPrice = product.getPriceNew().substring(1);
        return Double.parseDouble(newPrice);
      }
    }
    return 0;
  }

  public double getExPrice(String nameProduct) {
    List<CamerasProductBlock> products = getCamerasFromCameraPage();
    for (CamerasProductBlock product : products) {
      if (product.getNameString().equals(nameProduct)) {
        String price = product.getPriceTax();
        String exPrice = StringUtils.substringAfter(price, "$");
        return Double.parseDouble(exPrice);
      }
    }
    return 0;
  }

}
