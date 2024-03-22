
package pkg3d.surface;

public class Range {
	
	static public double[] create(double rangeMin, double rangeMax, int count) 
	{
		double resolution = (rangeMax - rangeMin) / (count - 1.0);
		
		double[] range = new double[count];
		
		double v = rangeMin;
		for (int i=0; i<count; i++) {
			range[i] = v;
			v += resolution;
		}
		 
		return range;
	}

}


