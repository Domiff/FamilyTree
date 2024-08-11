package View;

import java.util.Scanner;

public class View {
    Scanner scanner;
    
    public View() {
        this.scanner = new Scanner(System.in);
    }

    public int getAnswer(){
        System.out.println("Введите номер команды: ");
        int number = scanner.nextInt();
        return number;
    }

}
