package hu.homework06.jf;

public interface IMatrixOperation {

    void printMatrix(int[][] matrix);

    int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max);

    int[][] multiplyWithScalar(int scalar, int[] array);

    int[][] sum(int[][] array1, int[][] array2);
}