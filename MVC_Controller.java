package mvc.test;

import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MVC_Controller extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MVC_Model model;
	MVC_View view;
	
	public MVC_Controller(MVC_View v, MVC_Model m) {
		model = m;
		view = v;
	}

	
	
	protected void paintComponent(Graphics g) {
		for (Object s : model.shapes) {
			if (s instanceof Circle) {
				((Circle) s).draw(g);          // Draw circle and apply selected color
				g.setColor(model.circleChosenColor);
			} else if(s instanceof Star) {
				((Star) s).draw(g);            // Draw star and apply selected color
				g.setColor(model.starChosenColor); }
		}
	}
	
	public void test() {
		JFrame conJFrame = new JFrame();
		conJFrame = view.JFrame();
	}
}
