public class ConditonalOperator {
    public static void main(String[] args) {
        
    int a=10;
    int b=20;
   // conditional operator
   if(a>b){
    System.out.println("a is greater than b");
   }
   else{
    System.out.println("b is greater than b");
   }
   //instead of writing if and else i can use ternary oprerator which is also a conditional operator 
   System.out.println((a>b)?"a is greater":"b is greater");
}
}