package Command;

public class TestCommand {
	//Invoker
	public static void main(String[] args){
		
		Fan fan = new Fan();
		FanOnCommand fanOnCommand = new FanOnCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);
				
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		CommandSwitch commandSwitch = new CommandSwitch();
		commandSwitch.storeAndExecute(lightOnCommand);
		commandSwitch.storeAndExecute(fanOnCommand);
		commandSwitch.storeAndExecute(lightOffCommand);
		commandSwitch.storeAndExecute(fanOffCommand);
		
	}

}
