import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author heyx
 * @date 3/31/2020 12:58 PM
 */
public class ChromeDemo {
    public static void main(String[] args) throws InterruptedException {
        //自定义安装chrome路径,默认安装目录不需要配置此项
        //System.setProperty("webdriver.chrome.bin", "xxx");
        //指定chromeDriver存放路径
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("关闭浏览器，执行结束！");

    }
}
