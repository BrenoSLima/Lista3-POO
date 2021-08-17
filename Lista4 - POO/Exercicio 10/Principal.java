import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Principal {
	  public static void main(String[] args) {
		    String text = "";
		    JTextArea textArea = new JTextArea(text);

		    textArea.setSize(textArea.getPreferredSize().width, 1);
		    JOptionPane.showMessageDialog(null, new JScrollPane( textArea), "Nome",
		        JOptionPane.INFORMATION_MESSAGE);
		  }
}
