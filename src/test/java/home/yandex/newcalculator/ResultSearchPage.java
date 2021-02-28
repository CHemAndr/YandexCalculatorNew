package home.yandex.newcalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultSearchPage {

    public WebDriver driver;

    //Конструктор обращается к классу PageFactory
    //для инициализации элементов страницы по аннотация @FindBy
    public ResultSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //======================элементы страницы==========================================

    //Результат вычисления
    @FindBy(xpath = "//span[@class = 'calculator-display__result']")
    public WebElement calculationResult;

    //Кнопка x в степени y
    @FindBy(xpath = "//span[text() = 'x']/parent::button")
    private WebElement buttonXpY;

    //Кнопка x!
    @FindBy(xpath = "//span[text()='x!']/parent::button")
    private WebElement buttonXFact;

    //Кнопка +-
    @FindBy(xpath = "//span[text()='±']/parent::button")
    private WebElement buttonPlusMinus;

    //Кнопка C
    @FindBy(xpath = "//span[text()='C']/parent::button")
    private WebElement buttonC;

    //Кнопка ()
    @FindBy(xpath = "//span[text()='( )']/parent::button")
    private WebElement buttonBracket;

    //Кнопка %
    @FindBy(xpath = "//span[text()='%']/parent::button")
    private WebElement buttonPercentage;

    //Кнопка ÷
    @FindBy(xpath = "//span[text()='÷']/parent::button")
    private WebElement buttonDivide;

    //Кнопка asin
    @FindBy(xpath = "//span[text()='asin']/parent::button")
    private WebElement buttonAsin;

    //Кнопка sin
    @FindBy(xpath = "//span[text()='sin']/parent::button")
    private WebElement buttonSin;

    //Кнопка 1/x
    @FindBy(xpath = "//span[text()='1/x']/parent::button")
    private WebElement buttonInverse;

    //Кнопка 7
    @FindBy(xpath = "//span[text()='7']/parent::button")
    private WebElement buttonSeven;

    //Кнопка 8
    @FindBy(xpath = "//span[text()='8']/parent::button")
    private WebElement buttonEight;

    //Кнопка 9
    @FindBy(xpath = "//span[text()='9']/parent::button")
    private WebElement buttonNine;

    //Кнопка × (умножить)
    @FindBy(xpath = "//span[text()='×']/parent::button")
    private WebElement buttonMultiplay;

    //Кнопка acos
    @FindBy(xpath = "//span[text()='acos']/parent::button")
    private WebElement buttonAcos;

    //Кнопка cos
    @FindBy(xpath = "//span[text()='cos']/parent::button")
    private WebElement buttonCos;

    //Кнопка √
    @FindBy(xpath = "//span[text()='√']/parent::button")
    private WebElement buttonSqrt;

    //Кнопка 4
    @FindBy(xpath = "//span[text()='4']/parent::button")
    private WebElement buttonFour;

    //Кнопка 5
    @FindBy(xpath = "//span[text()='5']/parent::button")
    private WebElement buttonFive;

    //Кнопка 6
    @FindBy(xpath = "//span[text()='6']/parent::button")
    private WebElement buttonSix;

    //Кнопка − (минус)
    @FindBy(xpath = "//span[text()='−']/parent::button")
    private WebElement buttonMinus;

    //Кнопка atan
    @FindBy(xpath = "//span[text()='atan']/parent::button")
    private WebElement buttonAtan;

    //Кнопка tan
    @FindBy(xpath = "//span[text()='tan']/parent::button")
    private WebElement buttonTan;

    //Кнопка ln
    @FindBy(xpath = "//span[text()='ln']/parent::button")
    private WebElement buttonLn;

    //Кнопка 1
    @FindBy(xpath = "//span[text()='1']/parent::button")
    private WebElement buttonOne;

    //Кнопка 2
    @FindBy(xpath = "//span[text()='2']/parent::button")
    private WebElement buttonTwo;

    //Кнопка 3
    @FindBy(xpath = "//span[text()='3']/parent::button")
    private WebElement buttonThree;

    //Кнопка +
    @FindBy(xpath = "//span[text()='+']/parent::button")
    private WebElement buttonPlus;

    //Кнопка lg
    @FindBy(xpath = "//span[text()='lg']/parent::button")
    private WebElement buttonLg;

    //Кнопка π
    @FindBy(xpath = "//span[text()='π']/parent::button")
    private WebElement buttonPi;

    //Кнопка e
    @FindBy(xpath = "//span[text()='e']/parent::button")
    private WebElement buttonE;

    //Кнопка 0
    @FindBy(xpath = "//span[text()='0']/parent::button")
    private WebElement buttonZero;

    //Кнопка ,
    @FindBy(xpath = "//span[text() = ',']/parent::button")
    private WebElement buttonComma;

    //Кнопка =
    @FindBy(xpath = "//span[text() = '=']/parent::button")
    private WebElement buttonEqually;

    //======================методы работы с элементами ================================

    //Нажать кнопку XY
    public ResultSearchPage buttonXYClick() {
        buttonXpY.click();
        return  this;
    }
    //Нажать кнопку x!
    public ResultSearchPage buttonXFactClick() {
        buttonXFact.click();
        return  this;
    }
    //Нажать кнопку x!
    public ResultSearchPage buttonPlusMinusClick() {
        buttonPlusMinus.click();
        return  this;
    }
    //Нажать кнопку C
    public ResultSearchPage buttonCClick() {
        buttonC.click();
        return  this;
    }

    //Нажать кнопку ()
    public ResultSearchPage buttonBracketClick() {
        buttonBracket.click();
        return this;
    }

    //Нажать кнопку ()
    public ResultSearchPage buttonPercentageClick() {
        buttonPercentage.click();
        return this;
    }

    //Нажать кнопку ÷
    public ResultSearchPage buttonDivideClick() {
        buttonDivide.click();
        return this;
    }

    //Нажать кнопку asin
    public ResultSearchPage buttonAsinClick() {
        buttonAsin.click();
        return this;
    }

    //Нажать кнопку sin
    public ResultSearchPage buttonSinClick() {
        buttonSin.click();
        return this;
    }

    //Нажать кнопку 1/x
    public ResultSearchPage buttonInverseClick() {
        buttonInverse.click();
        return this;
    }
    //Нажать кнопку 7
    public ResultSearchPage buttonSevenClick() {
        buttonSeven.click();
        return this;
    }

    //Нажать кнопку 8
    public ResultSearchPage buttonEightClick() {
        buttonEight.click();
        return this;
    }

    //Нажать кнопку 9
    public ResultSearchPage buttonNineClick() {
        buttonNine.click();
        return this;
    }

    //Нажать кнопку × (умножение)
    public ResultSearchPage buttonMultiplayClick() {
        buttonMultiplay.click();
        return this;
    }

    //Нажать кнопку acos
    public ResultSearchPage buttonAcosClick() {
        buttonAcos.click();
        return this;
    }

    //Нажать кнопку cos

    public ResultSearchPage buttonCosClick() {
        buttonCos.click();
        return this;
    }

    //Нажать кнопку √
    public ResultSearchPage buttonSqrtClick() {
        buttonSqrt.click();
        return this;
    }

    //Нажать кнопку 4
    public ResultSearchPage buttonFourClick() {
        buttonFour.click();
        return this;
    }

    //Нажать кнопку 5
    public ResultSearchPage buttonFiveClick() {
        buttonFive.click();
        return this;
    }

    //Нажать кнопку 6
    public ResultSearchPage buttonSixClick() {
        buttonSix.click();
        return this;
    }

    //Нажать кнопку - (минус)
    public ResultSearchPage buttonMinusClick() {
        buttonMinus.click();
        return this;
    }

    //Нажать кнопку atan
    public ResultSearchPage buttonAtanClick() {
        buttonAtan.click();
        return this;
    }

    //Нажать кнопку tan
    public ResultSearchPage buttonTanClick() {
        buttonTan.click();
        return this;
    }

    //Нажать кнопку ln
    public ResultSearchPage buttonLnClick() {
        buttonLn.click();
        return this;
    }

    //Нажать кнопку 1
    public ResultSearchPage buttonOneClick() {
        buttonOne.click();
        return this;
    }

    //Нажать кнопку 2
    public ResultSearchPage buttonTwoClick() {
        buttonTwo.click();
        return this;
    }

    //Нажать кнопку 3
    public ResultSearchPage buttonThreeClick() {
        buttonThree.click();
        return this;
    }

    //Нажать кнопку +
    public ResultSearchPage buttonPlusClick() {
        buttonPlus.click();
        return this;
    }

    //Нажать кнопку Lg
    public ResultSearchPage buttonLgClick() {
        buttonLg.click();
        return this;
    }

    //Нажать кнопку π
    public ResultSearchPage buttonPiClick() {
        buttonPi.click();
        return this;
    }

    //Нажать кнопку E
    public ResultSearchPage buttonEClick() {
        buttonE.click();
        return this;
    }

    //Нажать кнопку 0
    public ResultSearchPage buttonZeroClick() {
        buttonZero.click();
        return this;
    }

    //Нажать кнопку ,
    public ResultSearchPage buttonCommaClick() {
        buttonComma.click();
        return this;
    }

    //Нажать кнопку =
    public ResultSearchPage buttonEquallyClick() {
        buttonEqually.click();
        return this;
    }

    //Получить результат вычисления
    public String getCalculationResult() {
        return calculationResult.getAttribute("innerHTML");
    }




}
