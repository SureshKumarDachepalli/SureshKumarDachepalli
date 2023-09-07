package suresh;

public class Demo {
	String gunName;
	int noofBullets;
	
	public Demo(String gunName,int noofBullets){
		this.gunName=gunName;
		this.noofBullets=noofBullets;
	}
	public void shoot(){
		for(int i=1;i<=noofBullets;i++){
			
			System.out.println("deshkew"+i);
		}
	}
	public static class url{
	public static void main(String[] args) {
		Demo g=new Demo("AK47",8);
		g.shoot();
		
	}
	}

}
