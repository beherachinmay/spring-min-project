package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbean.WishMessageGenerator;
public class DependencyinjectionTest {

	public static void main(String[] args) {
		System.out.println("Dependencyinjection Test.main() (start)");
		//create the IOC container
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Target spring Bean class object ref from the IOCcontainer
		Object obj=ctx.getBean("wmg");
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke the b.method
		String result=generator.generateWishMessage("raja");
	    System.out.println(result);
	    //close the IOC container
	    ctx.close();
	    System.out.println("DependencyinjectionTest.main() (end)");
	}

}
