import java.awt.Desktop;
import java.net.URI;

public class LinkedInProfile {
  public static void main(String[] args) {
    try {
      // Define the URL of your LinkedIn profile
      String profileUrl = "https://www.linkedin.com/in/your-profile-url";

      // Open the URL in the default web browser
      Desktop.getDesktop().browse(new URI(profileUrl));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
