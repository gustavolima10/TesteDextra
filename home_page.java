package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.Driver.driver;


public class home_page {

    @FindBy(linkText = "Home")
    protected WebElement home;

    @FindBy(linkText = "Blog")
    protected WebElement blog;

    @FindBy(linkText = "Sobre")
    protected WebElement sobre;

    @FindBy(linkText = "Contato")
    protected WebElement contato;

    @FindBy(linkText = "Cadastro")
    protected WebElement cadastro;

    @FindBy(xpath = "//a[contains(text(),'Pesquisa – QA')]")
    protected WebElement pesquisaQa;



    public void pesquisaQa (){
        PageFactory.initElements(driver,  this);
        pesquisaQa.click();
    }
}
