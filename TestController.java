package fh.aalen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/bye")
	public String sayBye() {
		return "Adios!";
	}
	
	@RequestMapping("/goodnight")
	public String sayGoodNight() {
		return "Schlaf Gut!";
	}
	
}
