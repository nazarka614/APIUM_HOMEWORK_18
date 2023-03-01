import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestKinozalPage extends BaseClass{
    static KinozalPageFactory kinozalPageFactory;
    @BeforeClass
    public static void b(){
        driver.get("https://kinozal.tv/");
        kinozalPageFactory = PageFactory.initElements(driver,KinozalPageFactory.class);
    }
    @Test
    public void test(){
        kinozalPageFactory.print();
    }
    @Test
    public void test2(){
        kinozalPageFactory.printTitle();
    }
}
