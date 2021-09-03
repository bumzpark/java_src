package  com.springBatchTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import  java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import  com.springBatchTest.service.TestDataService;

@SpringBootApplication
public class SpringBatchTestApplication {
	public static void main(String[] args) {
	 	try (ConfigurableApplicationContext ctx = SpringApplication.run(SpringBatchTestApplication.class , args)) {
	 		SpringBatchTestApplication m = ctx.getBean(SpringBatchTestApplication.class );
			m.selectDataf(); 
			m.selectUserf(); 
		}catch (Exception e) {
			// TODO: handle except   ion
			System.out.println(e.getMessage());
		}
	}
	
 	@Autowired
 	TestDataService  testDataService;
    public void selectDataf() {
    	System.out.println("test 사이즈:");
    	List<Map<String, Object>> tmp = testDataService.getTestDataList();
    	System.out.println("tmp.size사이즈:" + tmp.size());
    }
    
    public void selectUserf() {
    	System.out.println("test 사이즈:");
    	List<Map<String, Object>> tmp = testDataService.getAmUsersChangeList();
    	for(Map map : tmp) {
        	System.out.println("map:" + map.get("AM_INTERNAL_USER_ID"));
    		
    	}
    	System.out.println("tmp:" + tmp);
    }
}