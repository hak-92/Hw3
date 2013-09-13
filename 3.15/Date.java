
public class Date {
	int	month;
	int day;
	int year;
	
	public Date(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}
	
	public void setmonth (int m){	
		month = m;
	}
	
	public int getmonth(){
		return month;
	}
	
	public void setday(int d){	
		day = d;
	}
	
	public int getday(){
		return day;
	}
	
	public void setyear(int y){
		year = y;
	}
	
	public int getyear(){
		return year;
	}
	
	public void displayDate (){
	
		System.out.println (month + "/" + day + "/" + year);
	}
}
