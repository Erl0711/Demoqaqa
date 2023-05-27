package DemoqaTest.ui.elementsPageTest;

import DemoqaTest.ui.BaseUiTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.digital.ui.elementPage.TextBoxPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class TextBoxtTest extends BaseUiTest {

    @Test
    @Owner("Chadaev")
    @Description("input name and check")
    public void checkName(){
        String name = faker.randomFirstName();
        textBoxPage.inputField(textBoxPage.fullName, name);
        textBoxPage.resName.shouldHave(Condition.value(name));
    }

}
