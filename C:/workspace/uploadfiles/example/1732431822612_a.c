#include <stdio.h>


int main(){
    int num = 0;
    int blanks = 0;
    int stars = 1;
    printf("숫자를 입력해주세요 : ");
    scanf("%d",&num);
    blanks = num  ;
    int i,j,k;
    for(i=0; i<num; i++){
        for(j=0;j<blanks;j++){
            printf(" ");
        }
        for(k=0;k<stars;k++){
            printf("*");
        }
        for(j=0;j<blanks;j++){
            printf(" ");
        }
        blanks--;//0
        stars+=2;//10
        
        printf("\n");
        
    }
    blanks++;
    stars-=2;

    for(i=0; i<num; i++){
        blanks++;
        stars-=2;
        for(j=0;j<blanks;j++){
            printf(" ");
        }
        for(k=0;k<stars;k++){
            printf("*");
        }
        for(j=0;j<blanks;j++){
            printf(" ");
        }

        
        printf("\n");
        
    }

    return 0;
}