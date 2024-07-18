package in.onvtech.project;

import org.hibernate.mapping.List;
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
		user1.setEmail("vkumarsah999@gmail.com");
		user1.setPhone("1234567890");

		User user2 = new User();
		user2.setName("Vikram2");
		user2.setEmail("vkumarsah999@gmail.com");
		user2.setPhone("1234567890");

	





		

	}


}
