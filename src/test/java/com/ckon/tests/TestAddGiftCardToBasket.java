package com.ckon.tests;

import com.ckon.actions.SelectThirdGiftCard;
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
    protected SelectThirdGiftCard selectThirdGiftCard;

    @Autowired
    protected AmazonShoppingCartPage shoppingCartPage;

    protected String cardPrice;
    protected String cartSubtotal;
    
    @Test(description = "Should enter main page and then press Print at Home")
    public void verifyPriceIsTheSame() throws InterruptedException {
        cardPrice = selectThirdGiftCard.addGiftCardToBasket();
        cartSubtotal = shoppingCartPage.getCartSubtotal();
        assertEquals("Card price does not match Shopping cart subtotal", cardPrice, cartSubtotal);
    }
}
