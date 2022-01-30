class Uc1{
	public static void main(String s[]){
		int position = 0;
		int count=0;
		System.out.println("Position = "+position);
		for(int i=1;position<=100; i++){
		count++;
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
		if(position>100){
			break;
		}

		}
		System.out.println("Winning postion 100 player want "+count +"Count");
		System.out.println("Count = " +count);
		System.out.println("Position of player is = 100");
	}
}
