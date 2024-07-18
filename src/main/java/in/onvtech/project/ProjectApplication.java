package in.onvtech.project;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import in.onvtech.project.entities.User;
import in.onvtech.project.repositories.UserRepo;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(ProjectApplication.class, args);


		UserRepo userRepo = context.getBean(UserRepo.class);

		// single datavalues store
		// User user = new User();
		// user.setName("Vikram4");
		// user.setEmail("vkumarsah999@gmail.com");
		// user.setPhone("1234567890");
		// User User1 = userRepo.save(user);
		// System.out.println(User1);


		// multiple data values store object store

		User user1 = new User();
		user1.setName("Vikram1");
		user1.setEmail("abc@gmail.com");
		user1.setPhone("1234567890");

		User user2 = new User();
		user2.setName("Vikram2");
		user2.setEmail("abc@gmail.com");
		user2.setPhone("1234567890");

	
		// List<User> users =  List.of(user1,user2);
		// Iterable<User> result = userRepo.saveAll(users);
		// result.forEach(user -> {
		// 	System.out.println(user);
		// });

		// get all in byname   data from database
	    List<User>  findByName = userRepo.findByName("Vikram1");
		findByName.forEach(user -> {
			System.out.println(user);
		});



		

	}


}
