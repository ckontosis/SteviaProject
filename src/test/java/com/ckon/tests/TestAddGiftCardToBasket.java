package com.ckon.tests;

import com.ckon.actions.SelectThirdGiftCard;
import com.ckon.pageObjects.AmazonShoppingCartPage;
import com.persado.oss.quality.stevia.spring.SteviaTestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.springframework.test.util.AssertionErrors.assertEquals;

/**
 * Test to verify card price matches the shopping cart subtotal value
 * @author Christos Kontosis
 */
public class TestAddGiftCardToBasket extends SteviaTestBase {

    @Autowired
    protected SelectThirdGiftCard selectThirdGiftCard;

    @Autowired
    protected AmazonShoppingCartPage shoppingCartPage;

    protected String cardPrice;
    protected String cartSubtotal;

    @BeforeTest
    public void addGiftCardToBasket() {
        cardPrice = selectThirdGiftCard.addGiftCardToBasket();
        cartSubtotal = shoppingCartPage.getCartSubtotal();
    }

    /**
     * Assert card price matches the shopping cart subtotal value
     */
    @Test(description = "Should enter main page and then press Print at Home")
    public void verifyPriceIsTheSame() {
        assertEquals("Card price does not match Shopping cart subtotal", cardPrice, cartSubtotal);
    }
}
