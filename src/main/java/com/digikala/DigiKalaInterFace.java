package com.digikala;

/**
 * this interface contains all vertexes and nodes of Digikala-web-site graph
 * all static methods should be implement by DigiKalaTestClass
 *
 * @author Bahareh Mohajer
 * @version 1.0.0
 * @since 2020 -09-20
 */
public interface DigiKalaInterFace {

    void v_Start();
    void e_gotoDigikalaSite();
    void v_digikalaSite();
    void e_searchMobile();
    void v_isMobileSearched() throws InterruptedException;
    void e_mobileDetail() throws InterruptedException;
    void v_mobileDetailPage();
    void e_addToBasket();
    void v_addedMobileToMyBasket();
    void e_removeMobileFromBasket() throws InterruptedException;
    void v_emptyBasket();
    void e_backToDetail() throws InterruptedException;
    void e_digikalaItemClick();
    void e_TVSearch();
    void v_isTVSearched() throws InterruptedException;
    void e_LGTVSearch() throws InterruptedException;
    void v_isLGTVSearched() throws InterruptedException;
    void e_LGTVDetail() throws InterruptedException;
    void e_gotoHomePage();
    void v_TVDetailPage();


}
