import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner sc = new Scanner(System.in);
    
while (true){
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
      int option = sc.nextInt();

      if (option == 1){
          System.out.println("$98,345 average salary in South Florida!");
        
      }
     else if (option == 2){
          System.out.println("US News - 100 Best Jobs!");
	}
      else if (option == 3){
          System.out.println("Top 10 Forbes In-Demand Jobs!");
	}
     else if (option == 4){
       System.out.println("Current Students: ");
        while(fileScanner.hasNextLine()){
          String names = fileScanner.nextLine();
        System.out.println( names);
        }
	}
     else if (option == 5){
        break;
	}

}
    
}
    
}