package service;

import java.util.Scanner;

import entity.Team;
import repository.Teamrepository;

public class Teamservice {

	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");

		int input = sc.nextInt();
		
		System.err.println("You have selected option : " + input);
		int id = 0;
		

		switch (input) {
		case 1:{
		System.out.println("In case 1 :");
		System.out.println(Teamrepository.getMITeamDetails());
		System.out.println(Teamrepository.getRCBTeamDetails());
		System.out.println(Teamrepository.getLSGTeamDetails());
		System.out.println(Teamrepository.getGTTeamDetails());
		System.out.println(Teamrepository.getCSKTeamDetails());
		System.out.println(Teamrepository.getDCTeamDetails());
		System.out.println(Teamrepository.getPBKSTeamDetails());
		System.out.println(Teamrepository.getRRTeamDetails());
		System.out.println(Teamrepository.getKKRTeamDetails());
		System.out.println(Teamrepository.getSRHTeamDetails());
		break;
			
		}
		case 2:{
		System.out.println("Enter your team's short name or id :");
		sc.nextLine();
		String teamShortName = sc.nextLine();
		
		System.out.println("Enter your team short name :"+teamShortName);
		
		if(teamShortName.matches("\\d+")) {
			id=Integer.parseInt(teamShortName);
			
			
		}
		if(teamShortName.equalsIgnoreCase("MI") || id==101) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("CSK") || id==100) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("RCB") || id==219) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("SRH") || id==109) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("KKR") || id==327) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("LSG") || id==127) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("RR") || id==129) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("DC") || id==202) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("PBKS") || id==296) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		if(teamShortName.equalsIgnoreCase("GT") || id==177) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		else {
			System.out.println("Invalid shortname");
		}
		break;
		}
	default:
		throw new IllegalArgumentException("Unexpected value: "+ input);
		}
	}
}

