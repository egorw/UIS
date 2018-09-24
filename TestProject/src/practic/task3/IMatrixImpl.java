package practic.task3;

import nedis.study.interfaces.t3.classes.IMatrix;

public class IMatrixImpl implements IMatrix {

	private double array[][];
	private int rows;
	private int columns;
	
	public IMatrixImpl() {
		this(DEFAULT_MATRIX_SIZE, DEFAULT_MATRIX_SIZE);
	}

	public IMatrixImpl(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.array = new double[rows][columns];
	}

	@Override
	public int getRows() {
		return rows;
	}

	@Override
	public int getColumns() {
		return columns;
	}

	@Override
	public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
		return array[rowIndex][colIndex];
	}

	@Override
	public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
		array[rowIndex][colIndex] = value;
	}

	@Override
	public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
		IMatrix result = new IMatrixImpl(rows, columns);
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				result.setValueAt(i, j, 
						getValueAt(i, j) + otherMatrix.getValueAt(i, j));
			}
		}
		return result;
	}

	@Override
	public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
		IMatrix result = new IMatrixImpl(rows, columns);
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				result.setValueAt(i, j, 
						getValueAt(i, j) - otherMatrix.getValueAt(i, j));
			}
		}
		return result;
	}

	@Override
	public IMatrix mul(IMatrix b) throws IllegalArgumentException, NullPointerException {
		IMatrix a = this;
		IMatrix c = new IMatrixImpl(a.getRows(), b.getColumns());
		for(int i=0;i<c.getRows();i++){
			for(int j=0;j<c.getColumns();j++){
				double cij = 0.;
				for(int r=0;r<a.getColumns();r++){
					cij += a.getValueAt(i, r) * b.getValueAt(r, j);
				}
				c.setValueAt(i, j, cij);
			}
		}
		return c;
	}

	@Override
	public IMatrix mul(double value) {
		IMatrix result = new IMatrixImpl(rows, columns);
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				double resultValue = getValueAt(i, j) * value;
				result.setValueAt(i, j, resultValue);
			}
		}
		return result;
	}

	@Override
	public IMatrix transpose() {
		IMatrix result = new IMatrixImpl(columns, rows);
		for(int i=0;i<columns;i++){
			for(int j=0;j<rows;j++){
				result.setValueAt(i, j, getValueAt(j, i));
			}
		}
		return result;
	}

	@Override
	public void fillMatrix(double value) {
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array[i][j] = value;
			}
		}
	}

	@Override
	public double determinant() {
		return 0;
	}

	@Override
	public boolean isNullMatrix() {
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if(array[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean isIdentityMatrix() {
		if(!isSquareMatrix()) {
			return false;
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if(i == j && array[i][j] != 1) {
					return false;
				} else if(i != j && array[i][j] != 0) {
					return false;
				}
				/*if((i == j && array[i][j] != 1) || 
						(i != j && array[i][j] != 0)) {
					return false;
				}*/
			}
		}
		return true;
	}

	@Override
	public boolean isSquareMatrix() {
		return rows == columns;
	}

	@Override
	public void printToConsole() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				res.append(array[i][j]+" ");
			}
			res.append('\n');
		}
		return res.toString();
	}
}
