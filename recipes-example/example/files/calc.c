#include<stdio.h>
int add(a,b);
int sub(a,b);
int mul(a,b);
int div(a,b);
int main()
{
  int a,b,op;
  printf("enter the value a and b");
  scanf("%d \n%d",&a,&b);
  printf("1.add\n2.sub\n3.mul\n4.div");
  scanf("%d",&op);
  switch(op)
  {
	case 1:
	{
	add(a,b);
	}break;
	
	case 2:
	{
	sub(a,b);
	}break;
	case 3:
	{
	mul(a,b);
	}break;
	case 4:
	{
	div(a,b);
	}break;
  }
	printf("operation done");
}

