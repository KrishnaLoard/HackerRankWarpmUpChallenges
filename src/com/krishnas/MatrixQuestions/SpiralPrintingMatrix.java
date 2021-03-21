package com.krishnas.MatrixQuestions;


public class SpiralPrintingMatrix {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4, 5 }, 
						{ 16, 17, 18, 19, 6 }, 
						{ 15, 24, 25, 20, 7 }, 
						{ 14, 23, 22, 21, 8 },
						{ 13, 12, 11, 10, 9 }, };

		TraversingMatrix(mat);
	}

	public static void TraversingMatrix(int[][] matrix) {
		try {
			int top = 0, bottom = matrix.length - 1;
			int left = 0, right = matrix[0].length - 1;

			System.out.println("Checking the First time Bottom = " + bottom);
			System.out.println("Checking the First time Right = " + right);
			//System.out.println("Printing the Row " + matrix[0]);
			
			while (true) {
				
				
				for (int i = left ; i <= right ; i++) {
					System.out.print(matrix[top][i] + " ");
					
				}
				top++;
				if (top > bottom) {
					break;
				}
				
				for (int i = top; i <= bottom; i++) {
					System.out.print(matrix[i][right] + " ");
					
				}
				
				right--;
				
				if (left > right) {
					break;
				}
				
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i]+ " ");
					
				}
				bottom--;
				
				if (top > bottom) {
					break;
				}
				
				//print left Column
				for (int i = bottom; i >= top ; i--) {
					System.out.print(matrix[i][left] + " ");
					
				}
				left++;
				
				
			}
			
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
