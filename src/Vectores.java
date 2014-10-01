import java.util.*;
import java.util.Scanner;
import java.math.*;

class Vectores {
	//Edgar Alfonso Pérez Hernández
	//Carnet: 201021195
	
public static void main(String[] args) {
	Scanner x =	 new Scanner(System.in);
	int n1;
	System.out.println("Ingrese primera pareja de numeros: ");
	n1 = x.nextInt();	
	Scanner y =	 new Scanner(System.in);
	int n2;
	//System.out.println("Ingrese segundo numero de la primera pareja de numeros: ");
	n2 = y.nextInt();
	Scanner z =	 new Scanner(System.in);
	int n3;
	System.out.println("Ingrese segunda pareja de numeros: ");
	n3 = z.nextInt();
	Scanner w =	 new Scanner(System.in);
	int n4;
	//System.out.println("Ingrese segundo numero de la segunda pareja de numeros: ");
	n4 = w.nextInt();
	int a;
	a = (n1-n3);
	a = a*a;
	int b;
	b = (n2-n4);
	b = b*b;
	int c;
	c = a+b;
	System.out.println("La distancia entre los vectores es: ");
	Math.pow(c,2);
	System.out.println(Math.sqrt(c));
	 	}
}