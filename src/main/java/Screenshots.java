import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author heyx
 * @date 3/31/2020 1:01 PM
 */
public class Screenshots {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        try {
            ChromeDriver driver = new ChromeDriver();
            driver.get("http://www.baidu.com");//获取当前系统时间

            //定义系统时间输出格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
            String strTime = sdf.format(new Date());
            File img = driver.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile( img, new File("src/main/resources/"+strTime+"_img.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
