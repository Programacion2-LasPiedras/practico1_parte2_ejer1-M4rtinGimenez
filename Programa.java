import java.util.Scanner;

public class Programa {

    String apellido;
    int edad;
    double altura;
    long cedula;

	
	 Scanner entrada=new Scanner(System.in);
	
	 void imprimir (){
		cargar(apellido,edad,altura,cedula);
	}
  void cargar(String dato1,int dato2,double dato3,long dato4){
    System.out.println("Ingrese los datos pedidos a continuación");
    System.out.println("");
    dato1=apellido();
    dato2=edad();
    dato3=altura();
    dato4=cedula();
    imprimir(dato1, dato2, dato3, dato4);
  }
  String apellido(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Apellido:");
    String a=sc.nextLine();
    return a;
  }
  int edad(){
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    System.out.println("Edad:");
    int a=sc.nextInt();
    return a;
  }
  double altura(){
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    System.out.println("Altura:");    //Esta altura es en metros, separando la unidad con un punto
    double a=sc.nextDouble();
    return a;
  }
  long cedula(){
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    System.out.println("Cédula:");
    long a=sc.nextLong();
    return a;
  }
  void imprimir(String a, int b, double c, long d){
    System.out.println("");
    System.out.println("DATOS");
    System.out.println("Apellido: " + a);
    System.out.println("Edad: "+ b);
    System.out.println("Altura: " + c);
    System.out.println("Cédula: " + d);
  }
}
