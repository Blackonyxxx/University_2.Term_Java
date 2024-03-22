
package pkg3d.surface;



public class Face {
	final int[] vertexIndices; 

	public Face(int i1, int i2, int i3) 
	{
		vertexIndices = new int[3];
		vertexIndices[0] = i1;
		vertexIndices[1] = i2;
		vertexIndices[2] = i3;
	}

	public Face(int i1, int i2, int i3, int i4) 
	{
		vertexIndices = new int[4];
		vertexIndices[0] = i1;
		vertexIndices[1] = i2;
		vertexIndices[2] = i3;
		vertexIndices[3] = i4;
	}
	
	public Face(int[] vertexIndices) 
	{
		this.vertexIndices = vertexIndices;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		
		for (int fi : vertexIndices) {
			sb.append(fi + " ");
		}
		
		return sb.toString();
	}	
}
