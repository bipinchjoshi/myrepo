package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandSwitch {

	private List<Command> commands = new ArrayList<Command>();
	 
	   public void storeAndExecute(Command cmd) {
	      this.commands.add(cmd); // optional 
	      cmd.execute();
	   }
}
