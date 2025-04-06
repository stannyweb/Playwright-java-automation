package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class PlaywrightBasics {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

//        LaunchOptions lp = new LaunchOptions();
//        lp.setChannel("chrome");
//        lp.setHeadless(false);

        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();

        page.navigate("https://www.youtube.com");

        System.out.println("Title: " + page.title());
        System.out.println("URL: " + page.url());
    }
}
