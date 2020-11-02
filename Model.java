package mvc.pbl1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
	private List<Object> shapes = new ArrayList<>();
	private Random random = new Random();
	
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
	
	public void addCircle(int maxX, int maxY) {
		shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY))); }
	public void addStar(int maxX, int maxY) {
		shapes.add(new Star(random.nextInt(maxX), random.nextInt(maxY))); }
	
	public List<Object> getShapes() {
		return shapes;
	}
}
