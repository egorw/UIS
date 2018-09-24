package practic.task3;

import java.util.Random;

import nedis.study.interfaces.t3.classes.IMatrix;

public class Launcher {

	public static void main(String[] args) {
		
			//Random r = new Random();
			IMatrix m1 = new IMatrixImpl(2, 3);
			//m1.fillMatrix(2.);
			/*for(int i=0;i<m1.getRows();i++){
				for(int j=0;j<m1.getColumns();j++){
					m1.setValueAt(i, j, r.nextInt(100));
				}
			}*/
			m1.setValueAt(0, 1, 123);;
			m1.printToConsole();
			
			
		
		
	}

}
