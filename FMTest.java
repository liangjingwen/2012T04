package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Main.FM;

public class FMTest {
	
	FM fm = null;

	@Before
	public void setUp() throws Exception {
		System.out.println("测试开始！");
        fm = new FM();
        System.out.println("fm对象被初始化！");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("fm对象将被清理！");
        fm = null;
        System.out.println("测试结束！");
	}

	@Test
	public void testSetLogFile() {
		fm.setLogFile("log.txt");
		assertEquals("failure - strFileName is wrong","log.txt",fm.getLogFile());
		System.out.println("strFileName属性被测试！");
	}

	@Test
	public void testWarn() {
		fm.setLogFile("logFile.txt");
		assertTrue("failure - should be true",fm.warn(0, "jjsjjfdjdj"));
		System.out.println("setLogFile方法被测试！");
	}

}
