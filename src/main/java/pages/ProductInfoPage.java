package pages;

import blocks.ProductBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoPage extends BasePage {
    private final By clickButtonAdd = By.xpath("//button[@type='button']/i[contains(@class,'fa fa-heart')]");
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
