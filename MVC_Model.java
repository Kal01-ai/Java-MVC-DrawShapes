package mvc.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class MVC_Model  extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Random random = new Random();
	public List<Object> shapes = new ArrayList<>();
	
	public void DynamicShapes(String starColor, String circleColor, int i, String shape) {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(400, 400));
		
		switch(starColor) {  // Color option for star
		case "Red":
			setStarColor("Red"); break;
			
		case "Blue":
			setStarColor("Blue"); break; }
		
		switch(circleColor) {   // Color option for circle
		case "Red":
			setCircleColor("Red"); break;
			
		case "Blue":
			setCircleColor("Blue"); break; }
		
		switch(shape) {
		case "Circles":
			for(int j = 0; j < i; j++) {
				addCircle(390, 390); } break;
			
		case "Stars":
			for(int j = 0; j < i; j++) {
				addStar(380, 380); } break;
			
		case "Both":
			int mid = i / 2;
			for (int j = 0; j < i; j++) {
				addCircle(390, 390);
			} for (int j = mid; j < i; j++) {
				addStar(380, 380); }break;
		}
	}
	
	public void addCircle(int maxX, int maxY) {
		shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY))); repaint(); }
	public void addStar(int maxX, int maxY) {
		shapes.add(new Star(random.nextInt(maxX), random.nextInt(maxY))); repaint(); }
	
	Color circleChosenColor, starChosenColor;        // Color variables
	
	public Color setCircleColor(String circleColor) {
		if(circleColor == "Red") {
			return circleChosenColor = Color.RED;
		} else if(circleColor == "Blue") {
			return circleChosenColor = Color.BLUE;
		} return circleChosenColor;           // Get selected color for circle
	}
	
	public Color setStarColor(String starColor) {
		if(starColor == "Red") {
			return starChosenColor = Color.RED;
		} else if(starColor == "Blue") {
			return starChosenColor = Color.BLUE;
		} return starChosenColor;             // Get selected color for star
	}
}
