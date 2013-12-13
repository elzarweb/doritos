package src;

public class Borracho {
	
	//metodo para obtener que grado de borrachismo tienes
	public void getBorracho(int num_cerves){
		if(num_cerves>0 && num_cerves<10){
			System.out.println("No tienes que preocuparte, eres un español mas");
		}else if (num_cerves>=10 && num_cerves<20){
			System.out.println("Venga que tu puedes con alguna mas");
		}else if(num_cerves == 0){
			System.out.println("Ni llegaste al bar");
		}
		else{
			System.out.println("vete a casa ya BORRACHO!!!!");
		}
	}
}
