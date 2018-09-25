package practic.task6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;



public class BufferedFileCopyUtils extends SimpleFileCopyUtils {

	@Override
	protected InputStream getInput(String source) throws FileNotFoundException {
		return new BufferedInputStream(super.getInput(source));
	}

	@Override
	protected OutputStream getOutput(String destination) throws FileNotFoundException {
		return new BufferedOutputStream(super.getOutput(destination));
	}
}

