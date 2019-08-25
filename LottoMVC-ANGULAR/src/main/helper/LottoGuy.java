import java.util.List;

public class LottoGuy {
	public List<LottoBall> populateListWithBalls(List<LottoBall> listOfLottoBalls, int numberOfBalls){
		for (int i = 1; i <numberOfBalls+1; i++) {
			listOfLottoBalls.add(new LottoBall(i));
		}				
		return listOfLottoBalls;		
	}	
}
