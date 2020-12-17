package com.digikala;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class DigiKalaTestClass implements DigiKalaInterFace {
 WebDriver driver = null;
 WebDriverWait waiter = null;


 public void v_Start() {
  FirefoxDriverManager.getInstance().setup();
  driver = new FirefoxDriver();
  Assert.assertNotNull(driver);
  waiter = new WebDriverWait(driver, 50);
  Assert.assertNotNull(driver);
  System.out.println("starting test");

 }

 public void e_gotoDigikalaSite() {
  driver.get("http://www.digikala.com");

 }

 public void v_digikalaSite() {
  waiter.until(ExpectedConditions.urlContains("digikala"));

 }

 public void e_searchMobile() {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-search-input")));
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-search-input"))).clear();
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-search-input"))).sendKeys("mobile" + Keys.ENTER);

 }

 public void v_isMobileSearched() throws InterruptedException {
  String data =waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-product-box"))).getAttribute("data-title-en");
  System.out.println(data);
 }

 public void e_mobileDetail() throws InterruptedException {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-product-box__content--row"))).click();
  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
  driver.switchTo().window(tabs.get(tabs.size()-1));

 }

 public void v_mobileDetailPage() {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-content-expert__summary"))).isDisplayed();

 }

 public void e_addToBasket() {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-add-to-cart"))).click();

 }

 public void v_addedMobileToMyBasket() {
  int Basket_count = Integer.parseInt(waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-quantity-selector__number"))).getText());

  if(Basket_count>0){
   System.out.println("successfully added to my basket");
  }


 }

 public void e_removeMobileFromBasket() throws InterruptedException {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-cart-item__delete"))).click();
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-remodal-general-alert__button--cancel"))).click();
 }

 public void v_emptyBasket() {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-checkout-empty__title"))).isDisplayed();

 }

 public void e_backToDetail() throws InterruptedException {
  Thread.sleep(5000);

  driver.navigate().back();
  driver.navigate().back();

 }

 public void e_digikalaItemClick() {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.digikala.com']"))).click();
 }

 public void e_TVSearch() {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-search-input")));
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-search-input"))).clear();
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-search-input"))).sendKeys("TV" + Keys.ENTER);

 }

 public void v_isTVSearched() throws InterruptedException {
  String data = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-product-box"))).getAttribute("data-title-en");
  System.out.println(data);
 }

 public void e_LGTVSearch() throws InterruptedException {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-box__scroll")));
  List<WebElement> lstElements = driver.findElements(By.className("c-filter__label"));
  lstElements.get(1).click();
 }

 public void v_isLGTVSearched() throws InterruptedException {
  String data =waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-product-box"))).getAttribute("data-title-en");
  System.out.println(data);
 }

 public void e_LGTVDetail() throws InterruptedException {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-product-box__content--row"))).click();
  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
  driver.switchTo().window(tabs.get(tabs.size()-1));

 }

 public void e_gotoHomePage() {
  driver.findElement(By.className("c-header__logo")).click();

 }

 public void v_TVDetailPage() {
  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.className("c-content-expert__summary"))).isDisplayed();

 }
}

