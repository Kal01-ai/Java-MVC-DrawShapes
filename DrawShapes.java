package mvc.pbl1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawShapes extends JPanel {
	Model model = new Model();
	View view;
	
	public DrawShapes(View v, Model m) {
		view = v;
		model = m;
	}
	
	public DrawShapes(String starColor, String circleColor, int i, String shape) {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(400, 400));
		
		switch(starColor) {  // Color option for star
		case "Red":
			model.setStarColor("Red"); break;
			
		case "Blue":
			model.setStarColor("Blue"); break; }
		
		switch(circleColor) {   // Color option for circle
		case "Red":
			model.setCircleColor("Red"); break;
			
		case "Blue":
			model.setCircleColor("Blue"); break; }
		
		switch(shape) {
		case "Circles":
			for(int j = 0; j < i; j++) {
				model.addCircle(390, 390); }
			break;
			
		case "Stars":
			for(int j = 0; j < i; j++) {
				model.addStar(380, 380); }
			break;
			
		case "Both":
			int mid = i / 2;
			for (int j = 0; j < i; j++) {
				model.addCircle(390, 390);
			} for (int j = mid; j < i; j++) {
				model.addStar(380, 380); }
			break;
		}
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Object s : model.getShapes()) {
			if (s instanceof Circle) {
				((Circle) s).draw(g);          // Draw circle and apply selected color
				g.setColor(model.circleChosenColor);
			} else if(s instanceof Star) {
				((Star) s).draw(g);            // Draw star and apply selected color
				g.setColor(model.starChosenColor); }
		}
	}
}
