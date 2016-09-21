package prob4;

public class RectTriangle extends Shape implements Resizable{
	double width; 
	double height;
	
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height/2;
	}


	@Override
	public void resize(double s) {
		width *=0.5;
		height *=0.5;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return width +height+Math.sqrt((width*width)+(height*height));
	}




}
