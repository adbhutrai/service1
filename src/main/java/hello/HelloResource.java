package hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hello", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloResource {

	// Shallow implementation, saves bandwidth but doesn't save server resources.
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public Greeting getHello(@PathVariable("name") String name) {
		Greeting greeting = new Greeting();

		greeting.setMessage(String.format("%s %s", "Hello", name));

		return greeting;
	}
}