//contributed by github@mishalalshahari
#include<stdio.h>

void numberToString(int r){
    switch(r){
        case 0:
            printf("ZERO ");
            break;
        case 1:
            printf("ONE ");
            break;
        case 2:
            printf("TWO ");
            break;
        case 3:
            printf("THREE ");
            break;
        case 4:
            printf("FOUR ");
            break;
        case 5:
            printf("FIVE ");
            break;
        case 6:
            printf("SIX ");
            break;
        case 7:
            printf("SEVEN ");
            break;
        case 8:
            printf("EIGHT ");
            break;
        case 9:
            printf("NINE ");
            break;
    }
}

void digits(int n){
    int r,rev=0,p;
    while(n>0){
        p=n%10;
        rev=rev*10+p;
        n/=10;
    }
    while(rev>0){
        r=rev%10;
        numberToString(r);
        rev=rev/10;
    }
}

int main(){
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    digits(n);
}
