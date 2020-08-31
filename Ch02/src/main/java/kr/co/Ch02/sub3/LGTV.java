package kr.co.Ch02.sub3;

public class LGTV implements TV{
	
	private Speaker spk;
	
	public void setSpk(Speaker spk) {
		this.spk = spk;
	}
	
	
	@Override
	public void power() {
		System.out.println("LGTV power");
		
	}

	@Override
	public void chUp() {
		System.out.println("LGTV chUp");
		
	}

	@Override
	public void soundUp() {
		spk.soundUp();
		
	}
	
}
