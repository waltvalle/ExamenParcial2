
public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	// se saca el residuo de la variable num por 3 y si el resultado de la division es 0 entonces devuelve true
	{
		if ((num%3)==0)
			return true;
	// si no es 0 devuelve false	
		else
			return false;
	}
	
	//devuelve el numero menor entre a, b o c
	//3 puntos
	static int getMenor(int a, int b, int c)
	{
	//se compara a con b y c
	if (a<b && a<c)
		{
			return a;
		}
	//se compara b con a y c
	if (b<a && b<c)
		{
			return b;
		}
	//se compara c con a y b
	if (c<a && c<b)
		{
			return c;
		}
	{
		// si no se cumple ninguna devuelve cualquiera (a) 
		return (a);
	}
	}
	
	//devuelve el promedio los elementos de un arreglo: https://mx.answers.yahoo.com/question/index?qid=20080919173628AAfbWG9
	//5 puntos
	static int getPromedio(int arreglo[])
	{
	// se definen las variables promedio y cantnum
	int promedio = 0;
	int cantnum = 0;
	// se crea un for para el contador del arreglo
	for(int i=0; i<arreglo.length; i++) 
		{ 
	// promedio sera igual al n tamano del arreglo
		promedio += arreglo[i];
		cantnum++;
		} 
	// se calcula el promedio y devuelve el resultado 	
		promedio = (promedio / cantnum); 
	return promedio; 
	}
	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		// se definen las cadenas de las variables
		String cap1 = "Tegucigalpa";
		String cap2 = "Paris";
		String cap3 = "Londres";
		// se crean las condiciones de los 3 paises devolviendo la respectiva variable anteriormente definida
		if (pais== "Honduras")
		{
			return cap1;
		}
		if (pais== "Francia")
		{
			return cap2;
		}
		if (pais== "Inglaterra")
		{
			return cap3;
		}
		// si no se ingresa nada respectivo al programa se retorna un ?
		return "?";
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	{
		// se crea una condicion para indicar si num es igual a 0
		if ( num == 0 ) {
            return 0;
        } 
		// si no es 0 entra en la funcion recursiva de la siguiente manera
		else 
		{
            return num+funcionRecursiva(num-1);
        }
	}
	// Fin
	public static void main(String args[])
	{
	}
}
