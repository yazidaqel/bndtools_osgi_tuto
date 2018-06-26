package org.example.command;

import org.example.api.Greeting;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		property = {
				"osgi.command.scope=example",
				"osgi.command.function=greet"
		    },
		    service=GreetingCommand.class
		    )
public class GreetingCommand {
	private Greeting greetingSvc;

	@Reference(service = Greeting.class)
	public void setGreeting(Greeting greetingSvc) {
		this.greetingSvc = greetingSvc;
	}

	public void greet(String name) {
		System.out.println(greetingSvc.sayHello(name));
	}
}
