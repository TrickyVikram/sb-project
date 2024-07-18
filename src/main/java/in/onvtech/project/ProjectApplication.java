package in.onvtech.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import in.onvtech.project.entities.User;
import in.onvtech.project.repositories.UserRepo;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(ProjectApplication.class, args);


		UserRepo UserRepo = context.getBean(UserRepo.class);

		User user = new User();
		user.setName("Vikram4");
		user.setEmail("vkumarsah999@gmail.com");
		user.setPhone("1234567890");

		User User1 = UserRepo.save(user);

		System.out.println(User1);

		

	}


}
