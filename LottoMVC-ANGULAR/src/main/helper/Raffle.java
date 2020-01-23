import java.util.*;

public class Raffle {
	private List<LottoBall> listOfLottoBalls;

	public Raffle(List<LottoBall> listOfLottoBalls) {
		this.listOfLottoBalls = listOfLottoBalls;
	}

	public List<LottoBall> startRegularLottary(int numberOfWinningNumbers) {
		List<LottoBall> winningNumbers = getWinningNumbers(numberOfWinningNumbers);		
		return winningNumbers;
	}
	
	public void startJokerLottary(int numberOfWinningNumbers) {
		List<LottoBall> winningNumbers = getWinningNumbers(numberOfWinningNumbers);
		Display display = new JokerDisplay();
		display.printLottoBallList(winningNumbers);
	}

	private List<LottoBall> getWinningNumbers(int numberOfWinningNumbers) {
		List<LottoBall> winningNumbers = new ArrayList<LottoBall>();
		for (int i = 0; i < numberOfWinningNumbers; i++) {
			generateWinningNumbers(winningNumbers);
		}
		return winningNumbers;
	}

	private void generateWinningNumbers(List<LottoBall> winningNumbers) {
		LottoBall randomLottoBall = getRandomLottoBall();
		insertRandomLottoBallToWinningNumbers(randomLottoBall, winningNumbers);
	}

	private LottoBall getRandomLottoBall() {
		mixListofLottoBalls(listOfLottoBalls);
		Random rand = new Random();
		int index = rand.nextInt(listOfLottoBalls.size());
		LottoBall randomLottoBall = listOfLottoBalls.get(index);
		return randomLottoBall;
	}

	private void mixListofLottoBalls(List<LottoBall> listOfLottoBalls) {
		Collections.shuffle(listOfLottoBalls);
	}

	private void insertRandomLottoBallToWinningNumbers(LottoBall randomLottoBall, List<LottoBall> winningNumbers) {
		winningNumbers.add(randomLottoBall);
	}
}
