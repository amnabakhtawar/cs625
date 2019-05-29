public class MinMax {
public static void main(String[] args ) {
int num[]={100,2345,666,-456,-2,5,6,7,55556,234};
int max,min,i;
min=max=num[0];

for(i=0;i<10;i++){
if (min > num[i]) min=num[i];
if (max < num[i]) max=num[i];
}
System.out.println("max and min number is"+max+ " "+min);
}
}