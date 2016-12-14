package de.soeldnerconsult.windkraft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import de.soeldnerconsult.standort.config.JPAConfig;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(JPAConfig.class)
public class WindkraftApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
}
