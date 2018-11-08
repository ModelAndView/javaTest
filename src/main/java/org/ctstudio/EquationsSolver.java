package org.ctstudio;

/**
 * 二元一次方程组解题器，能解以下形式的二元一次方程组：
 * a1*x+b1*y+c1=0
 * a2*x+b2*y+c2=0
 * a1*b2+c1*b2-a2*b1-c2*b1 = 0
 *(a1*b2-a2*b1)*x = c2*b1-c1*b2
 * (b1*a2-b2*a1)*y=c2*a1-c1*a2;
 * 
 * 解题要求请参考README.md
 */
public class EquationsSolver {
	private  double a1 ;
	private  double b1 ;
	private  double c1 ;
	private  double a2 ;
	private  double b2 ;
	private  double c2 ;
	private  double x ;
	private  double y ;

	public EquationsSolver(double a1, double b1, double c1, double a2, double b2, double c2) {
		this.a1=a1;
		this.b1=b1;
		this.c1=c1;
		this.a2=a2;
		this.b2=b2;
		this.c2=c2;
	}

	public Double getX() {
		if(isNoResult()) {
			return null;
		}
		if(a1==0||a2==0) {
			return .0;
		}
		
		x = (c2*b1-c1*b2)/(a1*b2-a2*b1);
		return x;
	}

	public Double getY() {
		if(isNoResult()) {
			return null;
		}
		if(b1==0||b2==0) {
			return .0;
		}
		y=(c2*a1-c1*a2)/(b1*a2-b2*a1); 
		return y;
	}
	
	public boolean isNoResult() {
		boolean result = false;
		if((a1==0.0&&a2==0.0)||(b1==0&&b2==0)) {
			result = true;
		}
		return result;
	}

	
	
}
