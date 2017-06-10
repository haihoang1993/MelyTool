package AutoRegGmail;

import BaseAuto.BaseAuto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by funkoigame on 03/06/2017.
 */
public class BaseAutoRegGmail extends BaseAuto{
    public BaseAutoRegGmail(String linkRegFace, String srcFileChorome) {
        super(linkRegFace, srcFileChorome);
        startOpenLink(linkRegFace);
    }
}
