package home.yandex.newcalculator;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class YandexCalculatorNewTest {

    public static WebDriver driver;
    public static SearchYandexPage searchYandexPage;
    public static ResultSearchPage resultSearchPage;

    @BeforeAll
    public static void setup() {
        //определение пути к драйверу
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        //создание экземпляра драйвера (открывается браузер)
        driver = new ChromeDriver();
        searchYandexPage = new SearchYandexPage(driver);
        resultSearchPage = new ResultSearchPage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //неявное ожидание = 15 сек при загрузке страницы
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        //неявное ожидание = 3 сек при каждом поиске элемента
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //запуск браузера и переход по URL страницы
        driver.get("http://www.yandex.ru/");
        searchYandexPage.enterTextInSearchString("калькулятор");
        searchYandexPage.clickSearchButton();
    }

    @AfterAll
    public static void finished() {
        driver.close();
    }

    @Test
    void test1() {
        System.out.println("Тест SQRT старт");
         resultSearchPage.buttonCClick()
                         .buttonOneClick()
                         .buttonFourClick()
                         .buttonFourClick()
                         .buttonSqrtClick()
                         .buttonEquallyClick();
         //(new WebDriverWait(driver,5))
         //      .until(ExpectedConditions
         //      .attributeContains(resultSearchPage.calculationResult,"innerHTML","12"));
        assertThat("Не работает квадратный корень", "12",equalTo(resultSearchPage.getCalculationResult()));
        System.out.println("Тест SQRT стоп");
    }

    @Test
    void test2() {
        System.out.println("Тест COS Старт");
        resultSearchPage.buttonCClick()
                        .buttonCosClick()
                        .buttonPiClick()
                        .buttonDivideClick()
                        .buttonTwoClick()
                        .buttonEquallyClick();
        //(new WebDriverWait(driver,5))
        //        .until(ExpectedConditions
        //        .attributeContains(resultSearchPage.calculationResult,"innerHTML","0,99962421685"));
        assertThat("Не работает функция COS","0",equalTo(resultSearchPage.getCalculationResult()));
        System.out.println("Тест COS стоп");
    }

    @Test
    void test3() {
        System.out.println("Тест умножения старт");
        resultSearchPage.buttonCClick()
                        .buttonOneClick()
                        .buttonCommaClick()
                        .buttonFiveClick()
                        .buttonMultiplayClick()
                        .buttonOneClick()
                        .buttonZeroClick()
                        .buttonZeroClick()
                        .buttonEquallyClick();
        //(new WebDriverWait(driver,5))
        //        .until(ExpectedConditions
        //        .attributeContains(resultSearchPage.calculationResult,"innerHTML","150"));
        assertThat("Не работает умножение","150",equalTo(resultSearchPage.getCalculationResult()));
        System.out.println("Тест умножения стоп");
    }
}
