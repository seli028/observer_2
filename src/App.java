import com.example.newsletter.NewsAgency;
import com.example.newsletter.NewsChannel;

public class App {
    public static void main(String[] args) throws Exception {
        //News Agencies initialisieren
        var apa = new NewsAgency("APA");
        var reuters = new NewsAgency("Reuters");
        var legoCity = new NewsAgency("Lego City News");
        System.err.println("-------------------");

        //News Channels initialisieren
        var orf = new NewsChannel("orf.at");
        var nzz = new NewsChannel("nzz.ch");
        var nytimes = new NewsChannel("nytimes.com");
        System.err.println("-------------------");
        
        //Subscribe to APA
        apa.subscribe(orf);
        apa.subscribe(nzz);
        System.err.println("-------------------");

        //Subscribe to Reuters
        reuters.subscribe(nytimes);
        reuters.subscribe(nzz);
        System.err.println("-------------------");

        //Subscribe to Lego City News
        legoCity.subscribe(orf);
        legoCity.subscribe(nzz);
        legoCity.subscribe(nytimes);
        System.err.println("-------------------");

        //Broadcast news
        apa.broadcast("Auf der Suche nach der nächsten Regierung");
        System.err.println("-------------------");
        reuters.broadcast("Harris campaign raises $55 million over two weeks, campaign official says");
        System.err.println("-------------------");
        legoCity.broadcast("A man has fallen into the river in Lego City!");
    }
}
