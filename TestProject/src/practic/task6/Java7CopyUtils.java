package practic.task6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


import nedis.study.interfaces.t6.io.FileAlreadyExistsException;
import nedis.study.interfaces.t6.io.FileCopyFailedException;
import nedis.study.interfaces.t6.io.FileCopyUtils;





public class Java7CopyUtils implements FileCopyUtils {

	@Override
	public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
		try(InputStream in = new BufferedInputStream(new FileInputStream(source)); OutputStream out = 
				new BufferedOutputStream(new FileOutputStream(destination))){
			int _byte = -1;
			while((_byte = in.read()) != -1) {
				out.write(in.read());
			}
			out.flush();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}

	}	

}
