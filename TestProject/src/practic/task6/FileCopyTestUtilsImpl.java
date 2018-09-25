package practic.task6;

import nedis.study.interfaces.t6.io.FileCopyTestUtils;
import nedis.study.interfaces.t6.io.FileCopyUtils;

public class FileCopyTestUtilsImpl implements FileCopyTestUtils {

	@Override
	public FileCopyUtils createSimpleFileCopyUtils() {
		
		return new SimpleFileCopyUtils();
	}

	@Override
	public FileCopyUtils createBufferedFileCopyUtils() {
		
		return new BufferedFileCopyUtils();
	}

	@Override
	public FileCopyUtils createChannelsFileCopyUtils() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileCopyUtils createJava7CopyUtils() {
		
		return new Java7CopyUtils();
	}

}
