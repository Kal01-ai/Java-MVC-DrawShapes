package mvc.pbl1;

public class Main {
	public static void main(String[] args) {
		Model m = new Model();
		View v = new View(m);
		new DrawShapes(v, m);
	}
}
