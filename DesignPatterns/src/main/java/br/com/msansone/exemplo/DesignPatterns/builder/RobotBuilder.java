package br.com.msansone.exemplo.DesignPatterns.builder;

public class RobotBuilder {
	
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	public RobotBuilder setRobotHead(String robotHead) {
		this.robotHead = robotHead;
		return this;
	}
	public RobotBuilder setRobotTorso(String robotTorso) {
		this.robotTorso = robotTorso;
		return this;
	}
	public RobotBuilder setRobotArms(String robotArms) {
		this.robotArms = robotArms;
		return this;
	}
	public RobotBuilder setRobotLegs(String robotLegs) {
		this.robotLegs = robotLegs;
		return this;
	}
	
	public Robot getRobot() {
		return new Robot(this.robotHead,this.robotTorso,this.robotArms, this.robotLegs);
	}
	

	
	
}
