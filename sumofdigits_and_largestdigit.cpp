#include <iostream>
using namespace std;

int sumOfDigits(int n){
    int sum=0,r;
    while(n>0){
        r=n%10;
        sum+=r;
        n/=10;   
    }
    return sum;
}

int largestDigit(int n){
    int max=n%10,r;
    while(n>0){
        r=n%10;
        if(max<r) max=r;
        n/=10;
    }
    return max;
}

int main() {
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	cout<<"Number\t"<<"Sum of Digits\t"<<"Largest Digit"<<endl;
	for(int i=0;i<n;i++){
	    cout<<arr[i]<<"\t"<<sumOfDigits(arr[i])<<"\t"<<largestDigit(arr[i])<<endl;
	}
	return 0;
}
