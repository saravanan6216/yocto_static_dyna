#include<stdio.h>

int main()
{
	int a,b;
	int ch;
	printf("enter two numbers:\n");
	scanf("%d%d",&a,&b);
        printf("1.Addition(+) 2.Subtraction(-) 3.Multiplication(*) Enter Operator num\n");
	scanf("%d",&ch);

	switch(ch)
	{
		case 1:
			printf("%d+%d=%d\n",a,b,add(a,b));
			break;

		case 2:
			printf("%d-%d=%d\n",a,b,sub(a,b));
			break;

		case 3:
			printf("%d*%d=%d\n",a,b,mul(a,b));
			break;

		default:
			printf("Error\n");
			break;
	}
}

