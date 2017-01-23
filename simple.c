#include <stdio.h>


void printStupid(int, int);


int main(int argc, char** argv){

    int i = 10;
    int j = 12;

    printStupid(i, j);

return 0;    

}


void printStupid(int a, int b){

    printf("The sum of 10 and 12 is %d\n ", (a+b));

}
