package problem02;

public class SmartPhone extends MusicPhone {
	
	public String runApp() {
		return "앱실행";
	}
	
	@Override
	public void execute( String function ) {
		if (function.equals("음악")) {
			System.out.println(playMusic());
			return;
		}
		
		if(function.equals("앱")) {
			System.out.println(runApp());
			return;
		}
		super.execute(function);
		
	}

	public String playMusic() {
		return "스트리밍";
	}
	
}