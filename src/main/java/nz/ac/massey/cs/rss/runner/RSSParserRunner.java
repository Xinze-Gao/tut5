package nz.ac.massey.cs.rss.runner;

import nz.ac.massey.cs.sdc.parsers.Rss;
import nz.ac.massey.cs.sdc.parsers.RssChannel;
import nz.ac.massey.cs.sdc.parsers.RssItem;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBElement;
import java.net.URL;
import java.util.List;

public class RSSParserRunner {
    public static void main(String[] args) {
        try {
            // Create JAXB context for the generated parser classes
            JAXBContext context = JAXBContext.newInstance("nz.ac.massey.cs.sdc.parsers");
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Optional Task 1: Read RSS directly from network instead of file
            System.out.println("=== Reading RSS data from network ===");
            URL rssUrl = new URL("https://www.rnz.co.nz/rss/media-technology.xml");
            Rss rss = (Rss) unmarshaller.unmarshal(rssUrl);

            // Get channel information
            RssChannel channel = rss.getChannel();

            // Get all news items
            List<RssItem> items = channel.getItem();

            System.out.println("Number of Items: " + items.size());
            System.out.println("=====================================\n");

            // Process and print each news item
            for (RssItem item : items) {
                String title = "";
                String description = "";
                String link = "";
                String pubDate = "";

                // Iterate through all elements in the mixed content list
                for (Object obj : item.getTitleOrDescriptionOrLink()) {
                    if (obj instanceof JAXBElement) {
                        JAXBElement<?> element = (JAXBElement<?>) obj;
                        String elementName = element.getName().getLocalPart();
                        Object value = element.getValue();

                        // Extract specific elements by name
                        if ("title".equals(elementName) && value instanceof String) {
                            title = (String) value;
                        } else if ("description".equals(elementName) && value instanceof String) {
                            description = (String) value;
                        } else if ("link".equals(elementName) && value instanceof String) {
                            link = (String) value;
                        } else if ("pubDate".equals(elementName) && value instanceof String) {
                            // Optional Task 2: Extract publication date
                            pubDate = (String) value;
                        }
                    }
                }

                // Clean up description format - remove newlines and extra whitespace
                if (description != null) {
                    description = description.replaceAll("\\n\\s*", " ").trim();
                }

                // Print item information in required compact format
                System.out.println("title: " + title);
                System.out.println("description: " + description);
                System.out.println("link: " + link);
                // Optional Task 2: Print publication date
                System.out.println("pubDate: " + pubDate);
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error parsing RSS feed: " + e.getMessage());
            System.err.println("Please check your network connection and the RSS URL.");
        }
    }
}