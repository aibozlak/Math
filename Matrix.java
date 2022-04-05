public class Matrix {

   // Multiply A and B matrixes.  // -------> A cols == B rows !! <------
   public int[][] multiply(int[][] matrix1, int[][] matrix2){ 
		int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
		for (int i = 0; i < matrix1.length; i++){
			for (int j = 0; j < matrix2[0].length; j++){
				int sum = 0;
				for (int k = 0; k < matrix1[0].length; k++){ sum += (matrix1[i][k] * matrix2[k][j]); }
				matrix3[i][j] = sum;
			}
		}
		return matrix3;
	}

}
