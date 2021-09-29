package fr.twixer.OneZeroOnePong;

import fr.twixer.OneZeroOnePong.Builder.pong;

public class Main {
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.exit(84);
		} else if(args.length > 0 && args.length < 7 && !args[0].equals("-h")) {
			System.exit(84);
		} else if(args.length > 7 && !args[0].equals("-h")) {
			System.exit(84);
		} else if (args[0].equals("-h")) {
			System.out.println("USAGE"
					+ "\n"
					+ "\n"
					+ "./101pong x0 y0 z0 x1 y1 z1 n"
					+ "\n"
					+ "\n"
					+ "DESCRIPTION"
					+ "\n"
					+ "x0  ball abscissa at time t - 1"
					+ "\ny0  ball ordinate at time t - 1"
					+ "\nz0  ball altitude at time t - 1"
					+ "\nx1  ball abscissa at time t"
					+ "\ny1  ball ordinate at time t"
					+ "\nz1  ball altitude at time t"
					+ "\nn   time shift (greater than or equal to zero, integer)");
			System.exit(0);
		} else if (args.length == 7) {
			new pong(args).getSpeedVector();
		}

	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	    	System.out.println(e);
	        return false; 
	    } catch(NullPointerException e) {
	    	System.out.println(e);
	        return false;
	    }
	    return true;
	}
}

	