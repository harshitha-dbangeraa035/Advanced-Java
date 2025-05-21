/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
package Swings;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ColorTabbedPane {
	 JFrame frame;

	   ColorTabbedPane() {
	       frame = new JFrame("Color Tabbed Pane Example");

	       // Create Panels for each color
	       JPanel cyanPanel = new JPanel();
	       cyanPanel.setBackground(Color.CYAN);

	       JPanel magentaPanel = new JPanel();
	       magentaPanel.setBackground(Color.MAGENTA);

	       JPanel yellowPanel = new JPanel();
	       yellowPanel.setBackground(Color.YELLOW);

	       // Create Tabbed Pane
	       JTabbedPane tabbedPane = new JTabbedPane();
	       tabbedPane.add("Cyan", cyanPanel);
	       tabbedPane.add("Magenta", magentaPanel);
	       tabbedPane.add("Yellow", yellowPanel);

	       // Add tabbed pane to frame
	       frame.add(tabbedPane);

	       // Final frame setup
	       frame.setSize(400, 400);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setVisible(true);
	   }

	   public static void main(String[] args) {
	       new ColorTabbedPane();
	   }
	}


	   
	   
	   
	
