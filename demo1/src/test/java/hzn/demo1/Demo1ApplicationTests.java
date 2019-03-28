package hzn.demo1;

import hzn.demo1.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {
	@Autowired
	Person p;
	@Autowired
	ApplicationContext ioc;
	@Test
	public void contextLoads() {
		System.out.println(p);
		boolean b = ioc.containsBean("hs");
		System.out.println("是否包含指定的bean?"+b);
	}

}
