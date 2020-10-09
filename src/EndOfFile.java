import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (scanner.hasNext()){
            String sc = scanner.nextLine();
            System.out.println(i +" "+ sc);
            i++;
        }
    }
}

