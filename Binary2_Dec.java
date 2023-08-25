import java.util.Scanner;

class Binary2_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int dec;
        System.out.print("Enter The Number Of Binary  : ");
        a = sc.nextLine();
        dec = bin2dec(a);
        if (dec == -1) {
            System.out.println("Invalid NUMBER Please Binary Number  ");
        } else {
            System.out.println("Decimal  Number is =  " + dec);
        }

    }

    public static int bin2dec(String bs) {
        int dn = 0;
        int i = 0;
        int n;
        int len = bs.length();
        while (i < len) {
            n = bs.charAt(i) - 48;
            if (n != 0 && n != 1) {
                return -1;

            }
            dn = (dn * 2) + n;
            i++;
        }
        return (dn);

    }
}