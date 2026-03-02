
public class ArmstrongNumber {
public static void main(String[] args) {

int n = 153;
int temp = n;
int sum = 0;
for(; temp != 0; temp /= 10) {
int d = temp % 10;
sum += d * d * d;
}
if(sum == n)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");

}
}

class ArmstrongNumber_2 {
public static void main(String[] args) {

int n = 153;
int temp = n;
int sum = 0;
for(; temp != 0; temp /= 10) {
int d = temp % 10;
sum += d * d * d;
}
if(sum == n)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");

}
}

class ArmstrongNumber_3 {
public static void main(String[] args) {

int n = 153;
int temp = n;
int sum = 0;
for(; temp != 0; temp /= 10) {
int d = temp % 10;
sum += d * d * d;
}
if(sum == n)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");

}
}
