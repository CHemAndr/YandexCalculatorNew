package home.yandex.newcalculator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchYandexPage {

    public WebDriver driver;

    //Конструктор обращается к классу PageFactory
    //для инициализации элементов страницы по аннотация @FindBy
    public SearchYandexPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //======================элементы страницы==========================================

    //Строка поиска в Яндексе
    @FindBy(id = "text")
    private WebElement searchString;

    //Кнопка "Найти"
    @FindBy(xpath = "//button[text() = 'Найти']")
    private WebElement searchButton;



    //======================методы работы с элементами ================================

    //Ввод текста в строку поиска
    public void enterTextInSearchString (String text) {
        searchString.click();
        searchString.sendKeys(text);
    }

    //Нажать кнопку "Найти"
    public void clickSearchButton() {
        searchButton.click();
    }

}
