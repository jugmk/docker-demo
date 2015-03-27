package demo;

import mk.jug.demo.sbp.SpbApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpbApplication.class)
@WebAppConfiguration
public class SpbApplicationTests {

	@Test
	public void contextLoads() {
	}

}
