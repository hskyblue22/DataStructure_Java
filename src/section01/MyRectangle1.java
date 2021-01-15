package section01;

public class MyRectangle1 {

	public MyPoint1 lu;
	public int width;
	public int height; 
	
	public MyRectangle1(int x, int y, int w, int h) {
		lu = new MyPoint1(x, y);
		width = w;
		height = h;
		
	}
	public int calcArea() {
		return width * height;
	}
	
	public String toString() {
		return "(" + lu.x + ", " + lu.y + ")" + width + " "+ height;
	}
}
