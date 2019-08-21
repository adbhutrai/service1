package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hello")
public class HelloResource {

    // Shallow implementation, saves bandwidth but doesn't save server resources.
  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  public String getHello(@PathVariable("name") String name) {
    return String.format("%s %s", "Hello", name);
  }
}