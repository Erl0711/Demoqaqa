package DemoqaTest.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.digital.MockGenerator.FakerGenerator;
import com.digital.ui.elementPage.TextBoxPage;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {
    public FakerGenerator faker = new FakerGenerator();
    public TextBoxPage textBoxPage = new TextBoxPage();

    @BeforeClass
    public void setupSelenide(){
        Configuration.browser = "firefox";
        Configuration.browserSize = "1980x1024";
        Configuration.timeout = 8;
        Selenide.open("https://demoqa.com");
    }

}
