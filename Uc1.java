class Uc1{
	public static void main(String s[]){
		int position = 0;
		System.out.println("Position = "+position);
		int dice=(int)Math.floor(Math.random()*10)%6+1;
		System.out.println("Dice giver "+dice);
		double empCheck= Math.floor(Math.random()* 10) % 3;
		System.out.println("Check = "+empCheck);
		if(empCheck==1){
			position=position;
		}
		else if(empCheck==2){
			position=position+dice;
		}
		else{
			position=position;
			System.out.println("Check is 0 so no play");
		}
		System.out.println("Position of player is "+position);
	}
}
