package pages;

import blocks.ProductBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MyWishPage extends BasePage {
    private final By productContainer = By.xpath("//div[@class='table-responsive']");

    public List<ProductBlock> getAllProductsFromProductInfoPage() {
        List<ProductBlock> products = new ArrayList<>();
        List<WebElement> containers = getDriver().findElements(productContainer);
        for (WebElement container : containers) {
            ProductBlock productBlock = new ProductBlock(container);
            products.add(productBlock);

        }
        return products;
    }
}
