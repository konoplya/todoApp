package todoApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todoApp.domain.User;
import todoApp.domain.UserRepository;

@RestController
public class AppController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	public String index() {
		return "Dummy message";
	}

	@RequestMapping("/create")
	public String createUser() {
		userRepository.save(new User("kalgan", "123456"));
		return "Done";
	}
}
