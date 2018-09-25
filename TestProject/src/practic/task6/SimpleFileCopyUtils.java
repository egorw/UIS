package practic.task6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import nedis.study.interfaces.t6.io.FileAlreadyExistsException;
import nedis.study.interfaces.t6.io.FileCopyFailedException;
import nedis.study.interfaces.t6.io.FileCopyTestUtils;
import nedis.study.interfaces.t6.io.FileCopyUtils;

public class SimpleFileCopyUtils implements FileCopyUtils {

	protected InputStream getInput(String source) throws FileNotFoundException{
		return new FileInputStream(source);
	}
	
	protected OutputStream getOutput(String destination) throws FileNotFoundException{
		return new FileOutputStream(destination);
	}
	
	@Override
	public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
		if(new File(destination).exists()){
			throw new FileAlreadyExistsException(destination);
		}
		try (InputStream in = getInput(source); 
				OutputStream out = getOutput(destination)) {
			int _byte = -1;
			while((_byte = in.read()) != -1) {
				out.write(_byte);
			}
			out.flush();
		}  catch (IOException e) {
			throw new FileCopyFailedException("copy failed: "+e.getMessage(), e);
		}
	}

}
