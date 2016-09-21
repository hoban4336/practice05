package prob4;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height; 
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width *height;
	}

	@Override
	public void resize(double s) {
		width *=0.5;
		height *=0.5;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 	2*(width+height);
	}

}
