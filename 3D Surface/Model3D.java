
package pkg3d.surface;

import java.io.*;

public class Model3D {
	public final Point[] vertices;
	public final Face[] faces;
	
	Model3D(int vertexCount, int faceCount)
	{
		vertices = new Point[vertexCount];
		faces = new Face[faceCount];
	}
	
	public void saveToFile(String fileName)
	{
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    	    
			for (Point point : vertices) {
				writer.write("v " + point + "\n");
			}
			
			for (Face face : faces) {
				writer.write("f " + face + "\n");
			}
			
		    writer.close();			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}	
}
