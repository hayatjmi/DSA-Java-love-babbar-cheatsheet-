#include<stdio.h>
int main()
{
    int noOfDrinks[]={5,2,3,5,7};
    printf("Tables no of orders for drinks");
    for(int i=0;i<5;i++)
    {
        printf("\n%d\t%d \n ",i+1,noOfDrinks[i]);
    }

}