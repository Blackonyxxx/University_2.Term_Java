
package pkg3d.surface;


public class ModelGenerator {

	static Model3D create(Function f, double rangeMin, double rangeMax, int count) {
		double[] range = Range.create(rangeMin, rangeMax, count); 
		
		int vertexCount = count * count;
		int faceCount = (count - 1) * (count - 1); 
		Model3D model = new Model3D(vertexCount, faceCount);
		
		int vertexCounter = 0;
		int faceCounter = 0;
		for (int yi=0; yi<count; yi++) {
			double y = range[yi]; 
					
			for (int xi=0; xi<count; xi++) {
				double x = range[xi];
				double z = f.evaluate(x, y);

				if (yi > 0 && xi > 0) {
					int i1 = vertexCounter;
					int i2 = vertexCounter-count;
					int i3 = vertexCounter-count+1;
					int i4 = vertexCounter+1;
					Face face = new Face(i1, i2, i3, i4);
					
					model.faces[faceCounter++] = face;
				}
				
				Point vertex = new Point(x, y, z);
				model.vertices[vertexCounter++] = vertex;			
			}
		}		
		
		return model;
	}
	
}
