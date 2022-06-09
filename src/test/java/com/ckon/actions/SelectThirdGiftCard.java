package com.ckon.actions;

import com.ckon.pageObjects.AmazonGiftCardPage;
import com.ckon.pageObjects.AmazonMainPage;
import com.ckon.pageObjects.AmazonPrintAtHomeGiftCardPage;
import org.springframework.beans.factory.annotation.Autowired;

public class SelectThirdGiftCard {

    @Autowired
    private AmazonMainPage mainPage;

    @Autowired
    private AmazonGiftCardPage giftCardPage;

    @Autowired
    private AmazonPrintAtHomeGiftCardPage printAtHomePage;


    protected String price;

    public String addGiftCardToBasket() throws InterruptedException {
        mainPage.pressGiftCardButton();
        giftCardPage.pressPrintAtHomeButton();
        printAtHomePage.selectStandardDesigns();

//        printAtHomePage.selectCardDesign(3);
        printAtHomePage.selectThirdCardDesign();
        price = printAtHomePage.getCardPrice();
        printAtHomePage.clickAddToCartButton();

        return price;
    }
}
