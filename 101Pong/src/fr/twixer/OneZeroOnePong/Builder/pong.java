package fr.twixer.OneZeroOnePong.Builder;

import java.text.DecimalFormat;

public class pong {

	DecimalFormat num = new DecimalFormat("0.00"); 
	
	int	n;
	float xa;
	float ya;
	float za;
	float xb;
	float yb;
	float zb;
	  
	public pong(String[] args) {
		try {
			this.n = Integer.parseInt(args[6]);
			this.xa = Float.valueOf(args[0]);
			this.ya = Float.valueOf(args[1]);
			this.za = Float.valueOf(args[2]);
			this.xb = Float.valueOf(args[3]);
			this.yb = Float.valueOf(args[4]);
			this.zb = Float.valueOf(args[5]);
			if (this.n <= 0) {
				System.exit(84);
			}
		} catch (Exception e) {
			System.exit(84);
		}
	}

	public void getSpeedVector() {
		try {
			double x = xb - xa;
			double y = yb - ya;
			double z = zb - za;
			
			System.out.println("The velocity vector of the ball is:"
					+ "\n(" + num.format(x) + ", " + num.format(y) + ", " + num.format(z) + ")");
			getCoordinate(x, y, z);
			getIncidence(x, y, z);
		} catch (Exception e) {
			System.exit(84);
		}
	}
	
	private void getCoordinate(double a, double b, double c) {
		try {
			double d = this.xb + (n * a);
			double e = this.yb + (n * b);
			double f = this.zb + (n * c);
			System.out.println("At time t + " + this.n + ", ball coordinates will be:"
					+ "\n(" + num.format(d) + ", " + num.format(e) + ", " + num.format(f) + ")");
		} catch (Exception e) {
			System.exit(84);
		}
	}

	private void getIncidence(double a, double b, double c) {
		try {
			double scalar = (a * a) + (b * b);
			double distance1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
			double distance2 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			if((distance1 * distance2) == 0) {
				System.exit(84);
			}
			double angle = (Math.acos(scalar / (distance1 * distance2)) * (180 / Math.PI)); 
			if (c != 0 && ((-zb)/c) >= 0 && xb != 0) {
				System.out.println("The incidence angle is:"
						+ "\n" + num.format(angle) + " degrees");
			} else {
				System.out.println("The ball won't reach the paddle.");
			}
		} catch (Exception e) {
			System.exit(84);
		}
	}
	
	
}


