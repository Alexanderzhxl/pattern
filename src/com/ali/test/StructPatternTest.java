package com.ali.test;

import org.junit.Test;

import com.ali.pattern.nullobject.AbstractCustomer;
import com.ali.pattern.nullobject.CustomerFactory;
import com.ali.pattern.s_proxy.IImage;
import com.ali.pattern.s_proxy.ProxyImage;

/**
 * http://www.runoob.com/design-pattern/template-pattern.html
 * https://www.cnblogs.com/geek6/p/3951677.html
 * https://blog.csdn.net/zhangerqing/article/details/8245560
 * 
 * @author xiyu
 *
 */
public class StructPatternTest {

	@Test
	public void nullObjectTest() {
		AbstractCustomer cust = CustomerFactory.getCustomer("jack");
		System.out.println(cust.getName());
	}
	
	@Test
	public void proxyTest() {
		IImage proxy = new ProxyImage("xxx");
		proxy.display();
		proxy.display();
	}
}
