package practiceprogram;

public class Array {

        public static void main(String args[]){
            int b[]=new int[5];//declaration and instantiation
//int a[]={10,20,70,40,50};
            b[0]=10;//initialization
            b[1]=20;
            b[2]=70;
            b[3]=40;
            b[4]=50;
//traversing array
            for(int i=0;i<b.length;i++)//length is the property of array
                System.out.println(b[i]);
        }
    }
