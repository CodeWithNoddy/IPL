package repository;

import entity.Team;

public class Teamrepository {
	
		
		public static Team getMITeamDetails() {
			Team team = new Team();
			team.setId(101);
			team.setTeamName("Team Name : Mumbai indians");
			team.setCaptainName("Team Captain : Hardik pandya");
			team.setCoachName("Team Coach : Jaywardhan");
			team.setQualified(false);
			team.setnRR(7.45f);
			return team;
			
		}
		
		public static Team getCSKTeamDetails() {
			Team team1 = new Team();
			team1.setId(100);
			team1.setTeamName("Team Name : Chennai super kings");
			team1.setCaptainName("Team Captain : Ruturaj gaikwad");
			team1.setCoachName("Team Coach : Stephen fleming");
			team1.setQualified(false);
			team1.setnRR(6.45f);
			return team1;
			
		}
		
		public static Team getRCBTeamDetails() {
			Team team2 = new Team();
			team2.setId(219);
			team2.setTeamName("Team Name : Royal challengers banglore");
			team2.setCaptainName("Team Captain : Rajat patidar");
			team2.setCoachName("Team Coach : Andy flower");
			team2.setQualified(false);
			team2.setnRR(3.45f);
			return team2;
			
		}
		
		public static Team getSRHTeamDetails() {
			Team team3 = new Team();
			team3.setId(109);
			team3.setTeamName("Team Name : Sunrisers hyderabad");
			team3.setCaptainName("Team Captain : Pat cummins");
			team3.setCoachName("Team Coach : Daniel vettori");
			team3.setQualified(true);
			team3.setnRR(12.23f);
			return team3;
			
		}
		public static Team getRRTeamDetails() {
			Team team4 = new Team();
			team4.setId(129);
			team4.setTeamName("Team Name : Rajasthan royals");
			team4.setCaptainName("Team Captain : Sanju samson");
			team4.setCoachName("Team Coach : Rahul dravid");
			team4.setQualified(false);
			team4.setnRR(9.2f);
			return team4;
			
		}
		public static Team getGTTeamDetails() {
			Team team5 = new Team();
			team5.setId(177);
			team5.setTeamName("Team Name : Gujrat titans");
			team5.setCaptainName("Team Captain : Shubhman gill");
			team5.setCoachName("Team Coach : Ashish nehra");
			team5.setQualified(true);
			team5.setnRR(10.73f);
			return team5;
			
		}
		public static Team getLSGTeamDetails() {
			Team team6 = new Team();
			team6.setId(127);
			team6.setTeamName("Team Name : Lucknow super giants");
			team6.setCaptainName("Team Captain : Rishabh pant");
			team6.setCoachName("Team Coach : Justin langer");
			team6.setQualified(false);
			team6.setnRR(6.8f);
			return team6;
			
		}
		public static Team getDCTeamDetails() {
			Team team7 = new Team();
			team7.setId(202);
			team7.setTeamName("Team Name : Delhi capitals");
			team7.setCaptainName("Team Captain : Axar patel");
			team7.setCoachName("Team Coach : Hemang badani");
			team7.setQualified(false);
			team7.setnRR(7.83f);
			return team7;
			
		}
		public static Team getKKRTeamDetails() {
			Team team8 = new Team();
			team8.setId(327);
			team8.setTeamName("Team Name : Kolkata knight riders");
			team8.setCaptainName("Team Captain : Ajinkya rahane");
			team8.setCoachName("Team Coach : Chandrakant pandit");
			team8.setQualified(false);
			team8.setnRR(3.83f);
			return team8;
			
		}
		public static Team getPBKSTeamDetails() {
			Team team9 = new Team();
			team9.setId(296);
			team9.setTeamName("Team Name : Punjab kings");
			team9.setCaptainName("Team Captain : Shreyas iyer");
			team9.setCoachName("Team Coach : Ricky ponting");
			team9.setQualified(false);
			team9.setnRR(13.83f);
			return team9;
			
		}
	}
	


