package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Main.license;

public class licenseTest {
	
	license lic = null;

	@Before
	public void setUp() throws Exception {
		System.out.println("测试开始！");
		lic = new license();
		System.out.println("license对象被初始化！");
	}
	
    @After
    public void tearDown() throws Exception {
        System.out.println("license对象将被清理！");
        lic = null;
        System.out.println("测试结束！");
    }

	@Test
	public void testChangeInitialNum() {
		lic.ChangeInitialNum(4);
		assertEquals("failure - InitialLicenseNum is wrong",4,lic.getInitialNum());
		System.out.println("InitialLicenseNum属性被测试！");
	}

	@Test
	public void testJudgeServiceRequest() {
		lic.ChangeInitialNum(4);
		boolean[] predict = new boolean[5];
		for(int i = 0; i < 4; i++)
		{
			predict[i] = true;
		}
		predict[4] = false;
		for(int j = 0; j < 5; j++)
		{
			boolean result = lic.JudgeServiceRequest();
			assertEquals("failure - the result of the "+(j+1)+"th run of JudgeServiceRequest should not be "+predict[j],predict[j],result);
			System.out.println("JudgeServiceRequest方法被测试！");
		}
	}

}
