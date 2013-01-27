package org.andidev.webdriverextension.site;

import org.andidev.webdriverextension.annotation.Site;
import org.openqa.selenium.WebDriver;

@Site
public class WebDriverExtensionSite extends SiteObject {

    public WebDriverExtensionSite(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getUrl() {
        return "http://andidev.github.com/webdriver-extension";
    }

    @Override
    public void assertIsOpen() throws Error {
        examplesPage.assertIsOpen();
    }
}
