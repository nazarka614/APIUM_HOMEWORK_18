import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KinozalPageFactory extends BaseClass{
//
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/ul/li")
    WebElement elementListNews;

    @FindBy(xpath = "//div[@class = 'tp1_title']")
    List<WebElement> titleFilms;
    public  void print(){
        System.out.println(elementListNews.getText());
    }
    public  void printTitle(){
        for (WebElement t : titleFilms) {
            System.out.println(getFilmNames(t.getText()));
        }
    }

    public static String getFilmNames(String input) {
        int index = input.indexOf("(");
        if (index != -1) {
            return input.substring(0, index).trim();
        }
        return input;
    }
}
