package repository;

import entity.Team;

public class Teamrepository {
	
		
		public static Team getMITeamDetails() {
			Team team = new Team();
			team.setId(101);
			team.setTeamName("Mumbai indians");
			team.setCaptainName("Hardik pandya");
			team.setCoachName("Jaywardhan");
			team.setQualified(false);
			team.setnRR(7.45f);
			return team;
			
		}
		
		public static Team getCSKTeamDetails() {
			Team team = new Team();
			team.setId(100);
			team.setTeamName("Chennai super kings");
			team.setCaptainName("Ruturaj gaikwad");
			team.setCoachName("Stephen fleming");
			team.setQualified(false);
			team.setnRR(6.45f);
			return team;
			
		}
		
		public static Team getRCBTeamDetails() {
			Team team = new Team();
			team.setId(49);
			team.setTeamName("Royal challengers banglore");
			team.setCaptainName("Rajat patidar");
			team.setCoachName("Andy flower");
			team.setQualified(false);
			team.setnRR(3.45f);
			return team;
			
		}
		
		public static Team getSRHTeamDetails() {
			Team team = new Team();
			team.setId(278);
			team.setTeamName("Sunrisers hyderabad");
			team.setCaptainName("Pat cummins");
			team.setCoachName("Daniel vettori");
			team.setQualified(true);
			team.setnRR(12.23f);
			return team;
			
		}
		public static Team getRRTeamDetails() {
			Team team = new Team();
			team.setId(150);
			team.setTeamName("Rajasthan royals");
			team.setCaptainName("Sanju samson");
			team.setCoachName("Rahul dravid");
			team.setQualified(false);
			team.setnRR(9.2f);
			return team;
			
		}
		public static Team getGTTeamDetails() {
			Team team = new Team();
			team.setId(180);
			team.setTeamName("Gujrat titans");
			team.setCaptainName("Shubhman gill");
			team.setCoachName("Ashish nehra");
			team.setQualified(true);
			team.setnRR(10.73f);
			return team;
			
		}
		public static Team getLSGTeamDetails() {
			Team team = new Team();
			team.setId(120);
			team.setTeamName("Lucknow super giants");
			team.setCaptainName("Rishabh pant");
			team.setCoachName("Justin langer");
			team.setQualified(false);
			team.setnRR(6.8f);
			return team;
			
		}
		public static Team getDCTeamDetails() {
			Team team = new Team();
			team.setId(140);
			team.setTeamName("Delhi capitals");
			team.setCaptainName("Axar patel");
			team.setCoachName("Hemang badani");
			team.setQualified(false);
			team.setnRR(7.83f);
			return team;
			
		}
		public static Team getKKRTeamDetails() {
			Team team = new Team();
			team.setId(70);
			team.setTeamName("Kolkata knight riders");
			team.setCaptainName("Ajinkya rahane");
			team.setCoachName("Chandrakant pandit");
			team.setQualified(false);
			team.setnRR(3.83f);
			return team;
			
		}
		public static Team getPBKSTeamDetails() {
			Team team = new Team();
			team.setId(200);
			team.setTeamName("Punjab kings");
			team.setCaptainName("Shreyas iyer");
			team.setCoachName("Ricky ponting");
			team.setQualified(false);
			team.setnRR(13.83f);
			return team;
			
		}
	}
	


