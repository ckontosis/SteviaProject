package com.ckon.tests;

import com.ckon.pageObjects.AmazonGiftCardPage;
import com.ckon.pageObjects.AmazonPrintAtHomeGiftCardPage;
import com.ckon.pageObjects.AmazonShoppingCartPage;
import com.persado.oss.quality.stevia.spring.SteviaTestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ckon.pageObjects.AmazonMainPage;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class TestAddGiftCardToBasket extends SteviaTestBase {

    @Autowired
    protected AmazonMainPage amazonHome;

    @Autowired
    protected AmazonGiftCardPage giftCardPage;

    @Autowired
    protected AmazonPrintAtHomeGiftCardPage printAtHomePage;

    @Autowired
    protected AmazonShoppingCartPage shoppingCartPage;

    protected String cardPrice;
    protected String cartSubtotal;

    @BeforeTest
    public void addGiftCardToBasket() {
        amazonHome.pressDontChangeButton();
        amazonHome.pressGiftCardButton();
        giftCardPage.pressPrintAtHomeButton();
        printAtHomePage.selectStandardDesign();
        printAtHomePage.selectThirdCardDesign();
        cardPrice = printAtHomePage.getCardPrice();
        printAtHomePage.pressAddToCartButton();
        cartSubtotal = shoppingCartPage.getCartSubtotal();
    }

    @Test(description = "Should enter main page and then press Print at Home")
    public void verifyPriceIsTheSame() {
        assertEquals("Card price does not match Shopping cart subtotal", cardPrice, cartSubtotal);
    }
}
