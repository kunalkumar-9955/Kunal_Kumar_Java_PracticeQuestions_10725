
public class PrimesInRange {
public static void main(String[] args) {

int start = 10, end = 30;
for(int n = start; n <= end; n++) {
boolean isPrime = true;
for(int i = 2; i * i <= n; i++) {
if(n % i == 0) {
isPrime = false;
break;
}
}
if(isPrime && n > 1)
System.out.print(n + " ");
}

}
}

class PrimesInRange_2 {
public static void main(String[] args) {

int start = 10, end = 30;
for(int n = start; n <= end; n++) {
boolean isPrime = true;
for(int i = 2; i * i <= n; i++) {
if(n % i == 0) {
isPrime = false;
break;
}
}
if(isPrime && n > 1)
System.out.print(n + " ");
}

}
}

class PrimesInRange_3 {
public static void main(String[] args) {

int start = 10, end = 30;
for(int n = start; n <= end; n++) {
boolean isPrime = true;
for(int i = 2; i * i <= n; i++) {
if(n % i == 0) {
isPrime = false;
break;
}
}
if(isPrime && n > 1)
System.out.print(n + " ");
}

}
}
