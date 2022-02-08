import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số muốn chuyển đổi:");
        int numb = input.nextInt();
        String[] unit = {"Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine"};
        String[] ten = {"ty ", "1", "Twen", "Thir", "Four", "Fif", "Six", "Seven", "Eight", "Nine"};
        String text="", bigText="";
        boolean check = true;
        while (check) {
            if (0 <= numb && numb < 10) {
                text = unit[numb];
                check = false;
            } else if (10 <= numb && numb <= 20) {
                switch (numb) {
                    case 10:
                        text = "Ten";
                        break;
                    case 11:
                        text = "Eleven";
                        break;
                    case 12:
                        text = "Twelve";
                        break;
                    case 13:
                        text = "Thirteen";
                        break;
                    case 14:
                        text = "Fourteen";
                        break;
                    case 15:
                        text = "Fifteen";
                        break;
                    case 16:
                        text = "Sixteen";
                        break;
                    case 17:
                        text = "Seventeen";
                        break;
                    case 18:
                        text = "Eighteen";
                        break;
                    case 19:
                        text = "Nineteen";
                        break;
                    case 20:
                        text = "Twenty";
                        break;
                }
                check = false;
            } else if (20 < numb && numb < 100) {
                int index1 = numb / 10;
                int index2 = numb % 10;
                unit[0] = "";
                text = ten[index1] + ten[0] + unit[index2];
                check = false;
            } else if (numb >= 100) {
                if (numb % 100 == 0) {
                    int index = numb / 100;
                    bigText = unit[index] + " Hundred";
                    check = false;
                } else {
                    int index = numb / 100;
                    numb = numb%100;
                    bigText = unit[index] + " Hundred and ";
                }
            }
        }
        System.out.printf("%s%s",bigText,text);
    }
}
