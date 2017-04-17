import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws Exception {
        String url = "http://www.tripadvisor.com/Attraction_Review-g190479-d246507-Reviews-Bygdoy_Peninsula-Oslo_Eastern_Norway.html";
        Document document = Jsoup.connect(url).get();
        //System.out.println("Document: " + document);

        String question = document.select("#question .post-text").text();
        System.out.println("Question: " + question);

        Elements answerers = document.select(".partial_entry");
        for (Element answerer : answerers) {
            System.out.println("Answerer: " + answerer.text());
        }
    }
}
