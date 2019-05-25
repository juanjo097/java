import java.util.Scanner;

class numero_primo
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	int div = 0;
	boolean primo = true;

	System.out.println("Type a number: ");
	num = sc.nextInt();
	for(div = 2; div < num;div++)
	{
	    if(num % div == 0)
	    {
		primo = false;
	    }
	}
	if(primo)
        {
	    System.out.println("Number : " + num + " primo");
	}
	else
	{
	    System.out.println("Number: " + num + " is not primo");
	}
    }
}
