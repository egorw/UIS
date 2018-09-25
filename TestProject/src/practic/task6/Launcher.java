package practic.task6;

import nedis.study.interfaces.t6.io.FileAlreadyExistsException;
import nedis.study.interfaces.t6.io.FileCopyFailedException;
import nedis.study.interfaces.t6.io.FileCopyTestUtils;

public class Launcher {

	public static void main(String[] args) throws FileAlreadyExistsException, FileCopyFailedException {
		
		/*FileCopyTestUtils fctu = new FileCopyTestUtilsImpl();
		
		long timeBuffStart = System.currentTimeMillis();
		fctu.createBufferedFileCopyUtils().copyFile("E:\\Downloads\\584d.mp4", "D:\\3584d.mp4");
		long timeBuffEnd = System.currentTimeMillis();
		System.out.println(timeBuffEnd - timeBuffStart);
		
		long timeSimpleStart = System.currentTimeMillis();
		fctu.createSimpleFileCopyUtils().copyFile("E:\\Downloads\\584d.mp4", "D:\\2584d.mp4");
		long timeSimpleEnd = System.currentTimeMillis();
		System.out.println(timeSimpleEnd - timeSimpleStart);
		
		long timeJava7CopyStart = System.currentTimeMillis();
		fctu.createJava7CopyUtils().copyFile("E:\\Downloads\\584d.mp4", "D:\\1584d.mp4");
		long timeJava7CopyEnd = System.currentTimeMillis();
		System.out.println(timeJava7CopyEnd - timeJava7CopyStart);*/
		
		FileCopyTestUtils u = new FileCopyTestUtilsImpl();
		long start = System.currentTimeMillis();
		u.createSimpleFileCopyUtils().copyFile("E:\\Books\\M_Gardner_1971_-_Matematicheskie_golovolomki_i_razvlechenia_8.djvu",
				"E:res1.djvu");
		System.out.println((System.currentTimeMillis() - start) + " ms.");
		
		start = System.currentTimeMillis();
		u.createBufferedFileCopyUtils().copyFile("E:\\Books\\M_Gardner_1971_-_Matematicheskie_golovolomki_i_razvlechenia_8.djvu",
				"E:res2.djvu");
		System.out.println((System.currentTimeMillis() - start) + " ms.");
		
		start = System.currentTimeMillis();
		u.createJava7CopyUtils().copyFile("E:\\Books\\M_Gardner_1971_-_Matematicheskie_golovolomki_i_razvlechenia_8.djvu",
				"E:res3.djvu");
		System.out.println((System.currentTimeMillis() - start) + " ms.");
		

		
		
	}

}
