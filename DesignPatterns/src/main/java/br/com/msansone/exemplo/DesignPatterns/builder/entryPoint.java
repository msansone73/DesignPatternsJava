package br.com.msansone.exemplo.DesignPatterns.builder;

public class entryPoint {
	public static void main(String[] args) {
		
		Robot robot = new Robot("cabeça", "barriga","braço", "perna");
		Robot robotb = new RobotBuilder()
				.setRobotHead("cabeção")
				.setRobotTorso("barrigão")
				.setRobotArms("bração")
				.setRobotLegs("pernoca")
				.getRobot();
		
		System.out.println(robot.toString());
		System.out.println(robotb.toString());
	}
	
}
