
public class PalindromeNumber {
public static void main(String[] args) {

int n = 121;
int temp = n;
int rev = 0;
for(; temp != 0; temp /= 10) {
rev = rev * 10 + temp % 10;
}
if(n == rev)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");

}
}

class PalindromeNumber_2 {
public static void main(String[] args) {

int n = 121;
int temp = n;
int rev = 0;
for(; temp != 0; temp /= 10) {
rev = rev * 10 + temp % 10;
}
if(n == rev)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");

}
}

class PalindromeNumber_3 {
public static void main(String[] args) {

int n = 121;
int temp = n;
int rev = 0;
for(; temp != 0; temp /= 10) {
rev = rev * 10 + temp % 10;
}
if(n == rev)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");

}
}
