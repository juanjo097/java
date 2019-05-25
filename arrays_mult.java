import java.util.Scanner;


public class arrays_mult
{
    public static int[][] array_size()
    {
	//scanner to input a number
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	System.out.println("***************");
	System.out.println("Choose an array size: ");
	int row = sc1.nextInt();
	int col = sc2.nextInt();
	int n1 = row;
	int n2 = col;
	//array size
	int [][] numbers = new int[n1][n2];
	System.out.println("***************");

	return numbers;
    }
    public static void insert_elements(int[][] num)
    {
	Scanner sc = new Scanner(System.in);

	System.out.println("***************");

	for(int i = 0; i < num.length; i++)
	{
	    for(int j = 0; j < num[0].length; j++)
	    {
		System.out.println("Input a number :");

		num[i][j] = sc.nextInt();
	    }
	}
	System.out.println("***************");
    }

    public static void see_elements(int[][] num)
    {
	System.out.println("***************");
	for(int i = 0; i < num.length; i++)
        {
	    for(int j = 0; j < num[0].length; j++)
	    {
		System.out.println("Row: " + i + " Column: " + j + " Value : " + num[i][j] + "\n");
	    }
	}
	System.out.println("***************");
    }

    public static void see_columns_elements(int[][] num)
    {
	System.out.println("***************");
	for(int i = 0; i < num[0].length; i++)
        {
	    for(int j = 0; j < num.length; j++)
	    {
		System.out.println("Column: " + i + " -Row: " + j + " Value : " + num[j][i] + "\n");
	    }
	}
	System.out.println("***************");
    }

    public static void max_value(int[][] num)
    {
	int max = 0;
	int row = 0;
	int column = 0;

	for(int i = 0; i < num.length; i++)
	{
	    for(int j = 0; j < num[0].length; j++)
            {
		if(num[i][j] > max)
		{
		    max = num[i][j];
		    row = i;
		    column = j;
		}
	    }
	}

        System.out.println("***************");

	System.out.println("The max value is :" + max +" in row :" + row + " column: " + column);

	System.out.println("***************");
    }

    public static void sumar(int[][] num)
    {
	int suma = 0;
	int total = 0;

	for(int i = 0; i < num.length; i++)
        {
	    suma = 0;

	    for(int j = 0; j < num[0].length; j++)
	    {
		suma = suma + num[i][j];
	    }

	    System.out.println("Row: " + i + " suma " + suma + "\n");

	    total = total + suma;
	}

	System.out.println("Total: " + total);
    }

    public static void choose_insert(int[][] num)
    {
	Scanner sc = new Scanner(System.in);

	int row = 0;
	int column = 0;

	String resp;
	String trash;

	do
        {
	    System.out.println("Choose the row to change value: ");
	    row = sc.nextInt();
	    System.out.println("Choose the column to change value: ");
	    column = sc.nextInt();

	    if(row < num.length)
	    {
		if(column <  num[0].length)
		{
		    System.out.println("Choose a value: ");
		    num[row][column] = sc.nextInt();
		}
	    }
	    System.out.println("Do u wanna enter more values? Y/N");

	    trash = sc.nextLine();
	    resp = sc.nextLine();

	}
	while(resp.equals("y") || resp.equals("Y"));

	arrays_mult.see_elements(num);

    }

    public static void main(String args[])
    {
	int [][] numbers = array_size();
	//function to insert elements
	arrays_mult.insert_elements(numbers);
	//function to see all the elements
	arrays_mult.see_elements(numbers);
	//fucntion to see elements in columns & elements
	arrays_mult.see_columns_elements(numbers);
	//function to get the max value in array
	arrays_mult.max_value(numbers);
	//function to add the elements
	arrays_mult.sumar(numbers);
	//function to chanage values on wished position
	arrays_mult.choose_insert(numbers);
    }
}
