package service;

import entity.Team;
import repository.Teamrepository;

public class Teamservice {
	public void printTeamDetails() {
		Team team = Teamrepository.getMITeamDetails();
		Team team1 = Teamrepository.getCSKTeamDetails();
		Team team2 = Teamrepository.getSRHTeamDetails();
		Team team3 = Teamrepository.getRRTeamDetails();
		Team team4 = Teamrepository.getGTTeamDetails();
		Team team5 = Teamrepository.getLSGTeamDetails();
		Team team6 = Teamrepository.getDCTeamDetails();
		Team team7 = Teamrepository.getRCBTeamDetails();
		Team team8 = Teamrepository.getPBKSTeamDetails();
		Team team9 = Teamrepository.getKKRTeamDetails();
		System.out.println(team.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team1.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team2.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team3.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team4.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team5.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team6.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team7.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team8.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());
		System.out.println(team9.getId()+getTeamName()+getCaptainName()+getCoachName()+getnRR()+getId());

		
	}

	private int getTeamName() {
		// TODO Auto-generated method stub
		return 0;
	}

}
