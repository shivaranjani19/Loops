import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

//name for 'n' times using for loop
class loop1{
    static void main(String[] args) {
        for(int i=0;i<=3;i++){
            System.out.println("Er.Shivaranjani");
        }
    }
}

//numbers from 1->10 using for loop
class loop2{
    static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

//reversing the number
class loop3{
    static void main(String[] args) {
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}

//get the input to print the loop
class loop4{
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("get the input 1:");
        int a = scan.nextInt();
        System.out.println("get the input 2:");
        int b = scan.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}

//even or odd num using loop
class loop5{
    static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i%2==0){
                //System.out.println(i);
            }
            else{
                System.out.println(i);
            }
        }
    }
}

//oddcount
class loop6{
    static void main(String[] args) {
        int oddcount=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){
                //System.out.println(i);
            }
            else{
                System.out.println(i);
                oddcount = oddcount+1;
            }
        }
        System.out.println("count = " + oddcount);
    }
}

//numbers divisible by 3 and 5
class loop7{
    static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
            else{
                // System.out.println(i);
            }
        }
    }
}

//
class loop8{
    static void main(String[] args) {
        for(int i=0;i<=2;i++){
            for(int j=0;j<=5;j++){
                System.out.println("shiva");
            }
        }
    }
}

//while loop
class loop9{
    static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i=i+1;
        }
    }
}

//random number generator
class loop10{
    static void main(String[] args) {
        Random rand = new Random();
        int newnum=0;
        while(newnum!=5){
            newnum=rand.nextInt(11);
            System.out.println(newnum);
            newnum = newnum+1;
        }
    }
}

//do-while
class loop11{
    static void main(String[] args) {
        int i=1;
        do{
            System.out.println("Hi" + i);
            i++;
        }while(i<=4);
    }
}

//number greater than 10
class loop12{
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        do{
            System.out.println("enter the num>10:");
            count = scan.nextInt();
        }while(count<10);
    }
}

//sum of first n natural numbers
class loop13{
    static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int sum = 0;
            for(int i=0;i<=n;i++){
                sum = sum+i;
            }
        System.out.println(sum);
    }
}

//tables
class loop14{
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scan.nextInt();
        for(int i=0;i<11;i++){
            System.out.println(n*i);
        }
    }
}

//find the maxim
class loop15{
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}

//uppercase or lowercase
class loop16 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            char ch = in.next().trim().charAt(0);
            if(ch >='a'&&ch <='z')

            {
                System.out.println("lowercase");
            }
            else

            {
                System.out.println("uppercase");
            }
    }
}

//fibonacci
class loop17{
    static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int a = 0;
                int b = 1;
                int count = 2;
                while(count<=n){
                    int temp = b;
                    b = b+a;
                    a = temp;
                    count++;
                }
        System.out.println(b);
    }
}

//occurences
class loop18{
    static void main(String[] args) {
        int n = 45455;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==5){
                //System.out.println(count);
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

//reverse a number
class loop19{
    static void main(String[] args) {
        int num = 28479;
        int ans = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            ans = ans * 10+rem;
        }
        System.out.println(ans);
    }
}