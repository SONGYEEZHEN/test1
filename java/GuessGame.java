import java.util.Scanner;
import java.util.Random;
public class GuessGame{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Random r = new Random();
System.out.println("����������Ҫ�µ����ֵ");
int Guess_numberMax = sc.nextInt();
int number = r.nextInt(Guess_numberMax);
int i = 1;
int nember = sc.nextInt();
System.out.println(number);
while(true){
System.out.println("��������Ϸ��ʼ�������������");
int You_number = sc.nextInt();
if(You_number==number){
System.out.println("��ϲ�������");
System.out.println("��һ������"+ i +"��,�¶Ժð�Ŷ~");
break;
}
else if(You_number < number){
System.out.println("���µ�����С��");
i++;
}
else if (You_number > number){
System.out.println("���µ����ִ�");
i++;
}
else{
System.out.println("���µĸ�����������");
i++;
}System.out.println("��ǰ�µĵ�"+i+"��");
}
}
}