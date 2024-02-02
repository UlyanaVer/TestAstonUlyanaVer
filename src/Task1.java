import java.util.Scanner;

public class Task1 {
	public static int  sum (int a,int b){
		int resultSum = a+b;
		return resultSum;
	}

	public static int minus (int a,int b){
		int resultMinus = a-b;
		return resultMinus;
	}

	public static int multiply (int a,int b){
		int resultMultiply = a*b;
		return resultMultiply;
	}

	public static int division (int a,int b){
		int resultDivision = a/b;
		return resultDivision;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число a = ");
		int a = scanner.nextInt();
		System.out.println("Введите число b = ");
		int b = scanner.nextInt();

		if (a == b) {
			System.out.println("a = b");
		}
		if (a > b) {
			System.out.println("a > b");
		}else{
			System.out.println("a < b");
		}

		System.out.println("Введите операцию, которую хотите проделать с числами: + , - , * , / ");
		String operator = scanner.next();
		switch (operator) {
			case ("+"): System.out.printf("Результат равен: %d\n", sum (a, b));
				break;
			case ("-"): System.out.printf("Результат равен: %d\n", minus (a, b));
				break;
			case ("*"): System.out.printf("Результат равен: %d\n", multiply(a,b));
				break;
			case ("/"): System.out.printf("Результат равен: %d\n", division(a,b));
				break;
			default: System.out.println("Введенная операция не распознана, попробуйте еще раз");
		}
		scanner.close();
	}
}
