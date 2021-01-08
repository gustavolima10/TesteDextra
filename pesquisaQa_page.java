package pages;

import core.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static core.Driver.driver;

public class pesquisaQa_page {

    @FindBy(xpath = "//div/input[@name='fname']")
    protected WebElement inputNome;

    @FindBy(xpath = "//div/input[@name='lname']")
    protected WebElement inputSobrenome;

    @FindBy(xpath = "//div/input[@name='email']")
    protected WebElement inputEmail;

    @FindBy(xpath = "//div/input[@name='nf-field-8']")
    protected WebElement inputConfEmail;

    @FindBy(xpath = "//div/input[@name='phone']")
    protected WebElement inputPhone;

    @FindBy(xpath = "//label[@id='nf-label-class-field-10-0']")
    protected WebElement btnIdade18_30;

    @FindBy(xpath = "//label[@id='nf-label-class-field-10-1']")
    protected WebElement btmIdade31_49;

    @FindBy(xpath = "//label[@id='nf-label-class-field-10-2']")
    protected WebElement btnIdade49;

    @FindBy(xpath = "//select[@id='nf-field-11']")
    protected WebElement selectAreaQA;

    @FindBy(xpath = "//select[@id='nf-field-12']")
    protected WebElement selectAtraiuArea;

    @FindBy(xpath = "//li/label[contains(text(),'Técnico')]")
    protected WebElement btnTecnico;

    @FindBy(xpath = "//li/label[contains(text(),'Negócio')]")
    protected WebElement btnNegocio;

    @FindBy(xpath = "//li/label[contains(text(),'Comunicação')]")
    protected WebElement btnComunicacao;

    @FindBy(xpath = "//li/label[contains(text(),'Liderança')]")
    protected WebElement btnLideranca;

    @FindBy(xpath = "//li/label[contains(text(),'Todas as anteriores')]")
    protected WebElement btnTodasAnter;

    @FindBy(xpath = "//input[@id='nf-field-14']")
    protected WebElement inputLing_Inter;

    @FindBy(xpath = "//textarea[@id='nf-field-15']")
    protected WebElement inputResumo;

    @FindBy(xpath = "//div/input[@value='Enviar']")
    protected WebElement btnEnviar;

    @FindBy(xpath = "//p[contains(text(),'Your form has been successfully submitted.')]")
    protected WebElement msgSucessp;

    public void setDados (String nome, String sobrenome, String  email, String conf_email, String phone, String ling_inter, String resumo){
        PageFactory.initElements(driver,  this);
        inputNome.sendKeys(nome);
        inputSobrenome.sendKeys(sobrenome);
        inputEmail.sendKeys(email);
        inputConfEmail.sendKeys(conf_email);
        inputPhone.sendKeys(phone);
        inputLing_Inter.sendKeys(ling_inter);
        inputResumo.sendKeys(resumo);
    }

    public void selectElementos (){
        btnIdade18_30.click();
        new Select(selectAreaQA).selectByValue("menos-de-5-anos");
        new Select(selectAtraiuArea).selectByValue("salario");
        btnNegocio.click();
    }

    public void validaMensagem (){
        btnEnviar.click();
        Driver.waitVisibleElement(By.xpath("//p[contains(text(),'Your form has been successfully submitted.')]"));
        Assert.assertEquals("Your form has been successfully submitted.", msgSucessp.getText());
    }

    public WebElement getInputNome() {
        return inputNome;
    }

    public void setInputNome(WebElement inputNome) {
        this.inputNome = inputNome;
    }

    public WebElement getInputSobrenome() {
        return inputSobrenome;
    }

    public void setInputSobrenome(WebElement inputSobrenome) {
        this.inputSobrenome = inputSobrenome;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(WebElement inputEmail) {
        this.inputEmail = inputEmail;
    }

    public WebElement getInputConfEmail() {
        return inputConfEmail;
    }

    public void setInputConfEmail(WebElement inputConfEmail) {
        this.inputConfEmail = inputConfEmail;
    }

    public WebElement getInputPhone() {
        return inputPhone;
    }

    public void setInputPhone(WebElement inputPhone) {
        this.inputPhone = inputPhone;
    }

    public WebElement getInputLing_Inter() {
        return inputLing_Inter;
    }

    public void setInputLing_Inter(WebElement inputLing_Inter) {
        this.inputLing_Inter = inputLing_Inter;
    }

    public WebElement getInputResumo() {
        return inputResumo;
    }

    public void setInputResumo(WebElement inputResumo) {
        this.inputResumo = inputResumo;
    }
}
