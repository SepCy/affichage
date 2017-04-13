  

public class Point {

	private double x,y;
	
	Point()
	{
	x=0;
	y=0;
	}
	
	public double getX(){return x;}
	double getY(){return y;}
	
	void setXY(double x,double y)
	{
	this.x=x;
	this.y=y;
	}
	
	double distance(Point P)
	{
	double dx,dy;
	dx=x-P.x;
	dy=y-P.y;
	return java.lang.Math.sqrt(dx*dx+dy*dy);
	}
}
