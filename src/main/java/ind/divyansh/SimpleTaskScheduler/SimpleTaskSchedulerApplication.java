package ind.divyansh.SimpleTaskScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SimpleTaskSchedulerApplication {

	public static void main(String[] args) {
		System.out.println("main thread: " + Thread.currentThread().getName());
		SpringApplication.run(SimpleTaskSchedulerApplication.class, args);
	}

}
