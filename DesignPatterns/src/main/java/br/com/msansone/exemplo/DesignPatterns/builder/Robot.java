package br.com.msansone.exemplo.DesignPatterns.builder;

public class Robot {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	public Robot(String robotHead, String robotTorso, String robotArms, String robotLegs) {
		super();
		this.robotHead = robotHead;
		this.robotTorso = robotTorso;
		this.robotArms = robotArms;
		this.robotLegs = robotLegs;
	}
	public String getRobotHead() {
		return robotHead;
	}
	public void setRobotHead(String robotHead) {
		this.robotHead = robotHead;
	}
	public String getRobotTorso() {
		return robotTorso;
	}
	public void setRobotTorso(String robotTorso) {
		this.robotTorso = robotTorso;
	}
	public String getRobotArms() {
		return robotArms;
	}
	public void setRobotArms(String robotArms) {
		this.robotArms = robotArms;
	}
	public String getRobotLegs() {
		return robotLegs;
	}
	public void setRobotLegs(String robotLegs) {
		this.robotLegs = robotLegs;
	}
	@Override
	public String toString() {
		return "Robot [robotHead=" + robotHead + ", robotTorso=" + robotTorso + ", robotArms=" + robotArms
				+ ", robotLegs=" + robotLegs + "]";
	}
	
	
}
