import java.awt.Desktop;
import java.net.URI;
import java.lang.Object;
import javax.swing.JOptionPane;
class BrowseURL
{
  public static void main(String args[]) throws Exception
 {
  String foo = JOptionPane.showInputDialog(null,"Enter a website you want to go to!", "Enter URL here!");
  Sasdfasdfasdf
 Desktop d=Desktop.getDesktop();

 if (foo.matches(".*http://.*")) {
    d.browse(new URI(foo));
 }
 else {
 d.browse(new URI("http://" + foo));
 }
 }
}
