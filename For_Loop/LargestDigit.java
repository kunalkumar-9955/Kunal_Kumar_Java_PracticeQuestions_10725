
public class LargestDigit {
public static void main(String[] args) {

int n = 48291;
int max = 0;
for(; n != 0; n /= 10) {
int d = n % 10;
if(d > max) {
max = d;
}
}
System.out.println("Max Digit: " + max);

}
}

class LargestDigit_2 {
public static void main(String[] args) {

int n = 48291;
int max = 0;
for(; n != 0; n /= 10) {
int d = n % 10;
if(d > max) {
max = d;
}
}
System.out.println("Max Digit: " + max);

}
}

class LargestDigit_3 {
public static void main(String[] args) {

int n = 48291;
int max = 0;
for(; n != 0; n /= 10) {
int d = n % 10;
if(d > max) {
max = d;
}
}
System.out.println("Max Digit: " + max);

}
}
