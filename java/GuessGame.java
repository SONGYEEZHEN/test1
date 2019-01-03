import java.util.Scanner;
import java.util.Random;
public class GuessGame{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Random r = new Random();
System.out.println("请您输入您要猜的最大值");
int Guess_numberMax = sc.nextInt();
int number = r.nextInt(Guess_numberMax);
int i = 1;
int nember = sc.nextInt();
System.out.println(number);
while(true){
System.out.println("猜数字游戏开始请输入这个数字");
int You_number = sc.nextInt();
if(You_number==number){
System.out.println("恭喜您答对了");
System.out.println("您一共猜了"+ i +"次,猜对好棒哦~");
break;
}
else if(You_number < number){
System.out.println("您猜的数字小咯");
i++;
}
else if (You_number > number){
System.out.println("您猜的数字大咯");
i++;
}
else{
System.out.println("您猜的根本不是数字");
i++;
}System.out.println("当前猜的第"+i+"次");
}
}
}