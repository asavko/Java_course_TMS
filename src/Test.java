public class Test {
    public static void main(String[] args) {
     int num = 10;
     int sum = 0;
     while (num<55){
         if(num % 2 == 0){
           sum = sum + num;
         }
         num++;
     }
        System.out.println(sum);
    }
}
