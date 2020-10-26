package mvc.test;

public class GlobalMVC {
	
		public static void main(String args[]) {
			MVC_Model m = new MVC_Model();
			MVC_View v = new MVC_View(m);
			
			new MVC_Controller(v, m);
		}
	}
