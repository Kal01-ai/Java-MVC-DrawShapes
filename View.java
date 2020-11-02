package mvc.pbl1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View {
	String circleColor;
	String starColor;
	int amount;
	String shape;
	
	public View(Model model) {
		String circleColors[] = {"Red", "Blue"};                    // Menu for circle
		circleColor = (String) JOptionPane.showInputDialog(null,
				"Pick your color for circle", "Random Shapes...",
				JOptionPane.PLAIN_MESSAGE, null, circleColors, circleColors[0]);
		
		String starColors[] = {"Red", "Blue"};                       // Menu for star
		starColor = (String) JOptionPane.showInputDialog(null,
				"Pick your color for star", "Random Shapes...",
				JOptionPane.PLAIN_MESSAGE, null, starColors, starColors[0]);
		
		String shapeAmount = JOptionPane.showInputDialog(null, 
				"How many shapes?", "Random Shapes...", JOptionPane.PLAIN_MESSAGE);
		amount = Integer.parseInt(shapeAmount);
		
		String shapes[] = {"Stars", "Circles", "Both"};
        shape = (String) JOptionPane.showInputDialog(null,
                "Pick the shape you want", "Random Shapes...",
                JOptionPane.PLAIN_MESSAGE, null, shapes, shapes[0]);

        JFrame frame = new JFrame();
        frame.add(new DrawShapes(starColor, circleColor, amount, shape));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
