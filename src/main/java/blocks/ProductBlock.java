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

public class ProductBlock {

    private WebElement img;


    public ProductBlock(WebElement container) {

        try {
            this.img = container.findElement(By.xpath(".//img"));
        } catch (NoSuchElementException e) {
            this.img = null;
        }

    }

}
