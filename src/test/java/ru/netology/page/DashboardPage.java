package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;



public class DashboardPage {
    private SelenideElement heading = Selenide.$("[data-test-id=dashboard]");
    public DashboardPage() {
//        heading.shouldHave(text("Личный кабинет"));
        heading.shouldBe(Condition.visible);
    }

    public String getHeading() {
        return heading.getText().trim();
    }
}