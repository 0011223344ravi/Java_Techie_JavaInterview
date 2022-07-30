package Execption;

public class Test {

    public static void main(String[] args) throws OrderNoFoundException {
        int n =11;
      if(n>10){
          throw new OrderNoFoundException("order not found with id"+n);

      }
      else {
         System.out.println("Order with id "+n +"found");
      }
    }
}
