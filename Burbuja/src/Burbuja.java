public class Burbuja 
{
	public static void MostrarLista(int [] lista)
	{
		for(int i = 0; i<lista.length;i++)
		{
			System.out.print(lista[i]);
			if(i<lista.length-1)
				System.out.print(",");
			else
				System.out.println("");	
		}
	}
	public static void main(String[] args) 
	{
		int[] numeros={6,8,2,4,1,5,3,7,9,0};
		System.out.println("ORDENACIÓN BURBUJA");
		System.out.print("Lista original:");
		MostrarLista(numeros);
		for(int i = 0; i<numeros.length;i++)
		{
			boolean sinintercambios = true;
			for(int j = 0; j<numeros.length-1;j++)
			{
				if(numeros[j]>numeros[j+1])
				{
					int temp = numeros[j+1];
					numeros[j+1] = numeros[j];
					numeros[j] = temp;
					sinintercambios = false;
				}
			}
			System.out.print("Iteración " + i + ":");
			MostrarLista(numeros);
			if(sinintercambios)
				break;
		}
		System.out.print("Lista final:");
		MostrarLista(numeros);
	}
}


class a{}


