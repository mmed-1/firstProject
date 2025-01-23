import java.util.Scanner;

public class quiz {
    static int result(int[] anserws) {
        int[] correctAnsewrs = {4, 3, 1, 2};
        int score = 0;
        for(int i=0; i<4; i++) {
            if(anserws[i] == correctAnsewrs[i]) score++;
        }
        return score;
    }
    static void questions() {

        Scanner scanner = new Scanner(System.in);

        int[] ansewrs = new int[4];

        System.out.println("Which IP address not valid for a device: ");
        System.out.println("1) 192.168.20.4");
        System.out.println("2) 123.148.20.255");
        System.out.println("3) 12.18.20.4");
        System.out.println("4) 192.168.220.255");
        ansewrs[0] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The difference between dynamic Array and static Array in C/C++");
        System.out.println("1)they're the same");
        System.out.println("2)The differenece is every case memory pointe to another case");
        System.out.println("3)The difference is we can change the size of the dynamic array");
        System.out.println("4)nothing of those ansewrs");
        ansewrs[1] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the IP adresse broadcast for 123.12.234.200");
        System.out.println("1)123.255.255.255");
        System.out.println("2)255.0.0.0");
        System.out.println("3)123.255.255.0");
        System.out.println("4)123.12.234.255");
        ansewrs[2] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the the difference between the multicast and broadcast");
        System.out.println("1)they're the same");
        System.out.println("2)BroadCast u send to all devices in network multicast just for number of devices");
        System.out.println("3)Multicast u send to all devices in network broadcast just for number of devices");
        System.out.println("4)Nothing of these anserws");
        ansewrs[3] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("***************************************************");
        System.out.println("You got " + result(ansewrs) + "/4");
        System.out.println("***************************************************");

        scanner.close();
    }
    public static void main(String[] args) {
        System.out.println("****************************************************************************");
        System.out.println("Welcome to the Quiz!");
        System.out.println("****************************************************************************");
        System.out.println(); //empty Line

        System.out.println("****************************************************************************");
        System.out.println("Warning: If u type a number does not exist in the choices that's mean a fault ansew!");
        System.out.println("****************************************************************************");
        System.out.println();

        questions();
    }
}
