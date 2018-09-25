package practic.task6;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import nedis.study.interfaces.t6.io.IOUtils;

public class IOUtilsImpl implements IOUtils {

	@Override
	public void replaceChars(Reader in, Writer out, String inChars, String outChars)
			throws NullPointerException, IllegalArgumentException {
		if(in == null || out == null){
			throw new NullPointerException();
		}
		if (inChars == null) {
			inChars = "";
		}
		if (outChars == null) {
			outChars = "";
		}
		if(inChars.length() != outChars.length()) {
			throw new IllegalArgumentException("inChars.length() != outChars.length()");
		}
		try {
			int c = in.read();
			while(c != -1) {
				char ch = (char)c;
				int index = inChars.indexOf(ch);
				if(index != -1) {
					out.write(outChars.charAt(index));
				}
				out.write(ch);
				c = in.read(); 
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
	
	private static void find(List<String> result, File directory) {
		for(File el : directory.listFiles()) {
			if(el.isDirectory()) {
				find(result, directory);
			}
			else if (el.isFile()) {
				result.add(el.getAbsolutePath());
			}
		}
	}

	@Override
	public String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException {
		
		if(dir == null) {
			throw new NullPointerException();
		}
		if(!new File(dir).exists() && !new File(dir).isDirectory()) {
			throw new IllegalArgumentException("Not found: " + dir);
		}
		List<String> list = new ArrayList<>();
		File file = new File(dir);
		find(list, file);
		return list.toArray(new String[list.size()]);
	}
	
	public static void main(String[] args) {
		for (String file : new IOUtilsImpl().findFiles("E:\\Books")) {
			System.out.println(file);
			
		}
		
		Reader in = new StringReader("1234567890");
		StringWriter out = new StringWriter();
		new IOUtilsImpl().replaceChars(in, out, "357", "480");
		System.out.println(out.toString());
	}

}
