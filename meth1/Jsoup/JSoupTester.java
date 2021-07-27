/*import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
*/
javac -cp "jsoup-1.14.1.jar:." JSoupTester.java
java -cp "jsoup-1.14.1.jar:." JSoupTester.java

public class JSoupTester
{
  public static void main (String [] args) throws Exception
  {
    Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
    log(doc.title());
    Elements newsHeadlines = doc.select ("#mp-itn b a");
    for (Element headline: newsHeadlines){
      System.out.printf("%s/n/t%s", headline.attr("title"), headline.absUrl("href"));
    }
  }
}