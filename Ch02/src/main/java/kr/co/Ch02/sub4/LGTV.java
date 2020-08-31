package kr.co.Ch02.sub4;

public class LGTV implements TV{
	
	private Speaker spk;
	
	public LGTV(Speaker spk) {
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
